package codeCompileEncoding;

/**
 * java原文件是UTF-8编码格式，使用javac -encoding UTF-8 编译
 * 正常输出中文
 *
 * <P>
 * javac -encoding charSet 这个charSet要与java源文件存储的编码保持一致，
 * 否则会出现乱码,如果不指定就使用系统默认的编码System.getProperty("file.encoding")
 * </P>
 */
public class AppUTF_8
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("你好!");
    }
}
