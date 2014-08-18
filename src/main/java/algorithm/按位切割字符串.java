package algorithm;

import java.io.UnsupportedEncodingException;

public class 按位切割字符串 {

	//判断是否是中文
	public static boolean isChinese(char c) throws UnsupportedEncodingException
	{
		return String.valueOf(c).getBytes("UTF-8").length>1;
	}
	//返回值为取string的前几位
	public static int stringCut(String str,int count) throws UnsupportedEncodingException
	{
		if(str!=null&&str!="")
		{
			str=new String(str.getBytes(), "UTF-8");
			if(count>0&&count<str.getBytes().length)
			{
				int i=0;
				//双游标，count的当前剩余数量，和对应的字符串i的位置			
				while(count>0)
				{
					char c=str.charAt(i);
					//为字符的耗掉两位count
					if(isChinese(str.charAt(i)))
					{
						System.out.println(str.charAt(i)+"是汉字");
						count=count-2;	
						//可以调整顺序优化效率，如果count现在等于1的话，指向字符串的指针退回
						//如果count等于0表示刚好最后一个是汉字，恭喜你，
						//否则的话i指到下个位置
						if(count<0)
						{
							return i-1;
						}
						else if(count==0)
						{
							return i;
						}
						else
						{
							i++;			
						}
					}
					else
					{
						System.out.println(str.charAt(i)+"是字符");
						count=count-1;		
						//如果count等于0表示刚好最后一个是字符，恭喜你，
						//否则的话i指到下个位置
//						if(count<0)//实际上i不可能小于0
//						{
//							return i-1;
//						}
						if(count==0)
						{
							System.out.println("char,count"+count);
							return i;
						}
						else
						{
						i++;
						}
					}
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="我w我o我ABC汗DEF";
		System.out.println(isChinese('c'));
		System.out.println(s.charAt(0));
		System.out.println(isChinese(s.charAt(1)));
		try {
			int j=stringCut(s, 6);
			for (int i = 0; i < j+1; i++) {	
				System.out.println(s.charAt(i));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
