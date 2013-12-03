package codeCompileEncoding;

/**
 * java原文件是GBK编码格式，使用javac -encoding UTF-8 编译
 * 编译不通过
 * 出现这样的错误: 编码UTF-8的不可映射字符。
 * 解决方法：将java源文件的存储编码改为UTF-8，或者使用javac -encoding GBK编译
 *
 * <P>
 * javac -encoding charSet 这个charSet要与java源文件存储的编码保持一致，
 * 否则会出现乱码,如果不指定就使用系统默认的编码System.getProperty("file.encoding")
 * </P>
 *
 */
public class AppGBK_UTF8
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println("你好!");
    }
}
