package codeCompileEncoding;

/**
 * javaԭ�ļ���GBK�����ʽ��ʹ��javac -encoding UTF-8 ����
 * ���벻ͨ��
 * ���������Ĵ���: ����UTF-8�Ĳ���ӳ���ַ���
 * �����������javaԴ�ļ��Ĵ洢�����ΪUTF-8������ʹ��javac -encoding GBK����
 *
 * <P>
 * javac -encoding charSet ���charSetҪ��javaԴ�ļ��洢�ı��뱣��һ�£�
 * ������������,�����ָ����ʹ��ϵͳĬ�ϵı���System.getProperty("file.encoding")
 * </P>
 *
 */
public class AppGBK_UTF8
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println("���!");
    }
}
