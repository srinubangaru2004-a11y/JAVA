class AnagramDemo{
	public static void main(String[] args){
		String s1="listen";
		String s2="silent";
		int[] c1=new int[26];
		int[] c2=new int[26];
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			int ind=ch-'a';
			c1[ind]++;
		}
		for(int i=0;i<s2.length();i++){
			char ch=s2.charAt(i);
			int ind=ch-'a';
			c2[ind]++;
		}
		System.out.println(c1);

		System.out.println(c2);
	}
}