package codeCompileEncoding;

/**
 * java原文件是UTF-8编码格式，使用javac -encoding GBK 编译
 * ~__~可能会出现编译不过，这个是因为注释有中文，可以将注释去掉，再编译~__~
 * 这个有人知道原因的话 麻烦告诉一声:yongchun.chengyc@gmail.com
 *
 * 出现乱码：浣犲ソ!
 * 解决方法：将java源文件的存储编码改为GBK，或者使用javac -encoding UTF-8编译
 *
 * <P>
 * javac -encoding charSet 这个charSet要与java源文件存储的编码保持一致，
 * 否则会出现乱码,如果不指定就使用系统默认的编码System.getProperty("file.encoding")
 * </P>
 */
public class AppUTF8_GBK
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("你好!");

        //另一种解决方法,但不建议这样用
        //System.out.println(new String("你好!".getBytes("GBK"),"UTF-8"));
    }
}
