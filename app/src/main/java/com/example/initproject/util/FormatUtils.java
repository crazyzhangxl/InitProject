package com.example.initproject.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by zxl on 2017/8/30.
 */
public class FormatUtils {
    /**
     * 保留2位小数, 只保留
     */
        public static String keep2Decimal(double var){
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            return decimalFormat.format(var);
        }

    /**格式化两位小数, 4舍5入法
     * **/
        public static String percentage2Decimal(double var){
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            return decimalFormat.format(var);
        }

    /**
     * 提供精确加法计算的add方法
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
        public static double add(double value1,double value2){
             BigDecimal b1 = new BigDecimal(value1);
             BigDecimal b2 = new BigDecimal(value2);
             return b1.add(b2).doubleValue();
         }

    /**
     * 提供精确减法运算的sub方法
     * @param value1 被减数
     * @param value2 减数
     * @return 两个参数的差
     */
        public static double sub(double value1,double value2){
             BigDecimal b1 = new BigDecimal(value1);
            BigDecimal b2 = new BigDecimal(value2);
            return b1.subtract(b2).doubleValue();
        }

     /**
      * 提供精确乘法运算的mul方法
      * @param value1 被乘数*
      * @param value2 乘数
      * @return 两个参数的积
      */
        public static double mul(double value1,double value2){
             BigDecimal b1 = new BigDecimal(value1);
             BigDecimal b2 = new BigDecimal(value2);
            return b1.multiply(b2).doubleValue();
        }
     /**
     * 提供精确的除法运算方法div 几位小数
     * @param value1 被除数
     * @param value2 除数
     * @param scale 精确范围
     * @return 两个参数的商
     * @throws IllegalAccessException
     */
         public static double div(double value1,double value2,int scale) throws IllegalAccessException {
             //如果精确范围小于0，抛出异常信息
            if(scale<0){
                    throw new IllegalAccessException("精确度不能小于0");
                }
                BigDecimal b1 = new BigDecimal(value1);
                BigDecimal b2 = new BigDecimal(value2);
                return b1.divide(b2,scale).doubleValue();
         }


}
