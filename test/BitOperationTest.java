/**
 * @创建人: zengli
 * @描述 位运算测试
 * 文档：运算符.note
 * 链接：http://note.youdao.com/noteshare?id=87ace4d9c2b742b9c5afe25180e089e0&sub=084DB42D6119412EB8359FFA2E3F3935
 */
public class BitOperationTest {
    /**
     * &（与）
     * |（或）
     * ^（异或）
     * 规律：如果操作数A连续异或同一个操作数两次，那么结果还是操作数A　　　
     * ~（取反）
     * <<（左移）
     * 规律：一个操作数进行左移运算的时候，结果就是等于操作数乘以2的n次方，n就是左移的位数
     * 3<<1=3*2^1=6
     * 3<<2=3*2^2=12
     * >>（右移）
     * 规律：一个操作数进行右移运算的时候，结果就是等于操作数除以2的n次方，n就是右移的位数
     * 3>>1=3/2^1=1
     * 3>>2=3/2^2=0
     * >>>（无符号右移）
     * 无符号右移与右移的区别：进行右移运算的时候，如果操作数是一个正数，那么左边的空缺用0补，如果操作数是一个负数，那么左边的空缺用1补；使用无符号右移的时候，不管操作数是正数还是负数，空缺的位置都用0补
     *
     */
    public static void main(String[] args) {
        int a = (3 >>> 1);
        System.out.println("3 ("+toBinary(3)+")>>> 1("+toBinary(1)+"): "+a+" ,结果的二进制为： "+toBinary(a));
        int b = (3 >>> 2);
        System.out.println("3 ("+toBinary(3)+")>>> 2("+toBinary(2)+"): "+b+" ,结果的二进制为： "+toBinary(b));
        int c = (-3 >>> 1);
        System.out.println("-3 ("+toBinary(-3)+")>>> 1("+toBinary(1)+"): "+c+" ,结果的二进制为： "+toBinary(c));
        int d = (-3 >>> 2);
        System.out.println("-3 ("+toBinary(-3)+")>>> 2("+toBinary(2)+"): "+d+" ,结果的二进制为： "+toBinary(d));
        int e = (-3 >>> -1);
        System.out.println("-3 ("+toBinary(-3)+")>>> -1("+toBinary(-1)+"): "+e+" ,结果的二进制为： "+toBinary(e));
        int e1 = (-3 >>> 31);
        System.out.println("-3 ("+toBinary(-3)+")>>> 31("+toBinary(31)+"): "+e+" ,结果的二进制为： "+toBinary(e1));
        int f = (-3 >>> -2);
        System.out.println("-3 ("+toBinary(-3)+")>>> -2("+toBinary(-2)+"): "+f+" ,结果的二进制为： "+toBinary(f));
        int f1 = (-3 >>> 30);
        System.out.println("-3 ("+toBinary(-3)+")>>> 30("+toBinary(30)+"): "+f+" ,结果的二进制为： "+toBinary(f1));


    }


    /**
     * 将一个int数字转换为二进制的字符串形式。
     * @param num 需要转换的int类型数据
     *  digits 要转换的二进制位数，位数不足则在前面补0
     * @return 二进制的字符串形式
     */
    public static String toBinary(int num) {
        int digits = 8;
        int value = 1 << digits | num;
        String bs = Integer.toBinaryString(value); //0x20 | 这个是为了保证这个string长度是6位数
        return  bs.substring(1);
    }
}
