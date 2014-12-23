public class ArrayCopier
{
	public void copy ( int[] scr , int[] dst)
	{
		if (scr.length >= dst.length )
		{
			for ( int i=0 ; i<dst.length; i++)
			{
				dst[i] = scr[i];
			}
		} else
		{
			for ( int i = 0; i<scr.length; i++)
				dst[i] = scr[i];
		}
	}
}