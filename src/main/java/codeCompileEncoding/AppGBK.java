package codeCompileEncoding;

import java.lang.Exception;

/**
 * 操作系统win7 默认编码是GBK
 * java原文件是GBK编码格式，使用javac -encoding GBK 编译
 *
 * 可以正常输出中文
 */
public class AppGBK
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("你好!");
    }
}
