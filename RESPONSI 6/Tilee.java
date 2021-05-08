public class Tile
{
	public Tile()
	{
		absis = -1;
		ordinat = -1;
		type = '#';
		occupierCode = ' ';
	}
	public Tile(int x,int y,char _type,char _occupierCode)
	{
		absis = x;
		ordinat = y;
		type = _type;
		occupierCode = _occupierCode;
	}
	public Tile(Tile other)
	{
		absis = other.absis;
		ordinat = other.ordinat;
		type = other.type;
		occupierCode = other.occupierCode;
	}
	public void close()
	{
	}
	public int getAbsis()
	{
		return this.absis;
	}
	public int getOrdinat()
	{
		return this.ordinat;
	}
	public char getType()
	{
		return this.type;
	}
	public char getOccupierCode()
	{
		return this.occupierCode;
	}
	public void setAbsis(int x)
	{
		this.absis = x;
	}
	public void setOrdinat(int y)
	{
		this.ordinat = y;
	}
	public void setType(char newtype)
	{
		this.type = newtype;
	}
	public void setOccupier(char occCode)
	{
		this.occupierCode = occCode;
	}
	public boolean isMoveAble()
	{
		return (this.type != '#' && (this.occupierCode == ' ' || this.occupierCode == 'X'));
	}
	public void printCoordinate()
	{
		System.out.print("(");
		System.out.print(absis);
		System.out.print(",");
		System.out.print(ordinat);
		System.out.print(")");
		System.out.print("\n");
	}
}
