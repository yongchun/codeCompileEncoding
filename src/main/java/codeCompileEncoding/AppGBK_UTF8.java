package codeCompileEncoding;

/**
 * ����ϵͳwin7 Ĭ�ϱ�����GBK
 * javaԭ�ļ���GBK�����ʽ��ʹ��javac -encoding UTF-8 ����
 *
 * ���벻ͨ����ԭ����Ų�
 */
public class AppGBK_UTF8
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(new String("���!".getBytes("UTF-8"),"GBK"));
    }
}
