package codeCompileEncoding;

import java.lang.Exception;

/**
 * java原文件是GBK编码格式，使用javac -encoding GBK 编译
 * 正常输出中文
 *
 * <P>
 * javac -encoding charSet 这个charSet要与java源文件存储的编码保持一致，
 * 否则会出现乱码,如果不指定就使用系统默认的编码System.getProperty("file.encoding")
 * </P>
 */
public class AppGBK
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("你好!");
    }
}
