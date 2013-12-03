package codeCompileEncoding;

/**
 * 操作系统win7 默认编码是GBK
 * java原文件是UTF-8编码格式，使用javac -encoding GBK 编译
 *
 * 可以正常输出中文
 *
 */
public class AppUTF8_GBK
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println(new String("你好!".getBytes("GBK"),"UTF-8"));
    }
}
