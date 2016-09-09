/**
 * 此文件来自开源项目giac
 * 2016.7.23
 */
/*
 *  Copyright (C) 2011 Leonel Hernández Sandoval.
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.giac.calculator.calc;

public class Computer {

    public static String compute(String expression) {
        try {
            expression = resultFromGiac(expression);
            return expression;
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return "error";
    }

    public static String computeForGraph(String expression) {
        try {
            expression = resultFromGiacSVG(expression);
            return expression;
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return "error";
    }

    public static String getGraph() {
        return getCurrentGraph();
    }

    public static String computeTex(String expression) {
        return resultFromGiacTex(expression);
    }

    public static String parseTex(String expression) {
        return parseFromGiacTex(expression);
    }

    /*
	public static String computeMathml(String lineToCompute){

		try{
			  return resultFromGiacMathml(lineToCompute);
			}catch(Exception ex){
		  		ex.printStackTrace();
		  		return "error";
		  	}
	}*/


    public native static String resultFromGiac(String computation);

    public native static String resultFromGiacMathml(String computation);

    public native static String parseFromGiacMathml(String computation);

    public native static String resultFromGiacTex(String computation);

    public native static String parseFromGiacTex(String computation);

    public native static String resultFromGiacSVG(String computation);

    public native static String parseFromGiacSVG(String computation);

    public native static String getPlotterPreamble(double width, double height);

    public native static String getPlotterBox();

    public native static String getCurrentGraph();

    static {
        System.loadLibrary("qtgiac");
    }
}
