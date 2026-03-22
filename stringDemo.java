class MostFrequentChar{
	public static void main(String[] args){
		String s="";
		int[] freq=new int[52];
		for(int i=0; i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z'){
				int ind=ch-'A';
				freq[ind]++;
			}
			else{
				int ind=ch-'a';
				freq[ind+26]++;
			}
		}
		int maxi=0;
		char res='';
		for(int i=0;i<52;i++){
			if(freq[i]>maxi){
				maxi=freq[i];
			}	
		}
		for(int i=0;i<52;i++){
			if(freq[i]==maxi && maxi>0){
				if(i<26){
					System.out.println((char)(i+'A'));
				}
				else{
					System.out.println((char)(i-26+'a'));
				}
			}
		}
	}
}