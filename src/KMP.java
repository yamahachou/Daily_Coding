/**
 * Created by yamahachou on 2019/5/2.
 */
public class KMP {
    private String pat;
    private int dfa[][];
    public KMP(String pat)//获取dfa数组
    {
        this.pat=pat;
        int M=pat.length();
        int R=256;
        dfa=new int [R][M];

        dfa[pat.charAt(0)][0]=1;//初始化
        for(int X=0,j=1;j<M;++j)//将整个长度记录都遍历出来
        {
            for(int c=0;c<R;c++)//遍历所有字符
                dfa[c][j]=dfa[c][X];//复制匹配失败时的回溯值
            dfa[pat.charAt(j)][j]=j+1;//记录匹配成功时的值
            X=dfa[pat.charAt(j)][X];//更新重启状态
        }
    }
    public int search(String txt)//开始匹配字符
    {//在txt上模拟DFA运行
        int i,j,N=txt.length(),M=pat.length();
        for(i=0,j=0;i<N&&j<M;++i)
            j=dfa[txt.charAt(i)][j];
        if(j==M)
            return i-M;//找到匹配 (字串的结尾)先判断
        else
            return N;// 没有找到匹配 (母船的结尾)
    }
    public static void main(String args[]) {//KMP字符串查找的测试用例
        String pat = args[0];
        String txt = args[1];
        KMP kmp = new KMP(pat);
        System.out.print("text: " + txt);
        System.out.print("pattern: ");
        for (int i = 0; i < offset; ++i)
            stdout.print(" ");
        stdout.println(pat);

        ---------------------
    }
}
