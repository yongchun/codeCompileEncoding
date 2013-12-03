package codeCompileEncoding;

/**
 * 操作系统win7 默认编码是GBK
 * java原文件是GBK编码格式，使用javac -encoding UTF-8 编译
 *
 * 编译不通过，原因待排查
 */
public class AppGBK_UTF8
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(new String("你好!".getBytes("UTF-8"),"GBK"));
    }
}
