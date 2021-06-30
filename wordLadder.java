// Word Ladder/ BFS 

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs=new HashSet<>();
        for(String s:wordList)
        hs.add(s);
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        int cnt=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            cnt++;
            for(int i=0;i<n;i++)
            {
                char ch[]=q.poll().toCharArray();
                for(int j=0;j<ch.length;j++)
                {
                    char temp=ch[j];
                    for(char k='a';k<='z';k++)
                    {
                        ch[j]=k;
                        String str=new String(ch);
                        if(hs.contains(str))
                        {
                            if(str.equals(endWord))
                                return cnt+1;
                            q.add(str);
                            hs.remove(str);
                        }
                    }
                    ch[j]=temp;
                }
            }
        }
        return 0;
    }
}
