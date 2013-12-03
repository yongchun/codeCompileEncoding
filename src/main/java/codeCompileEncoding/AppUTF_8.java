package codeCompileEncoding;

/**
 * 操作系统win7 默认编码是GBK
 * java原文件是UTF-8编码格式，使用javac -encoding UTF-8 编译
 *
 * 可以正常输出中文
 */
public class AppUTF_8
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("你好!");
    }
}
