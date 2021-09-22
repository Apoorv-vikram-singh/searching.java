class searching
{
    public static void main(String args[])
    {
        int arr[]={1,23,45,6,7,89};
        int j=89;
        int flag=0;
        for(int i=0;i<arr.length;i++)
    	{
		if(arr[i]==j)
		{
			flag++;
		}
	}
if (flag==0)
{
	System.out.println("not found ");
}
if(flag>1);
{
	System.out.println(" found");
}
System.out.println(flag);
}
}
