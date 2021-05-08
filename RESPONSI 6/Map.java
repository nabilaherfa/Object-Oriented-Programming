public class Map
{
	public Map()
	{
		row_size = 0;
		col_size = 0;
	}

	public Map(int banyak_baris, int banyak_kolom, String map_entry)
	{
		row_size = banyak_baris;
		col_size = banyak_kolom;
		map = new Tile[row_size];
    
		for (int i = 0; i < row_size; i++)
		{
			map[i] = tangible.Arrays.initializeWithDefaultTileInstances(col_size);
			for (int j = 0; j < col_size; j++)
			{
				map[i][j].setOrdinat(i);
				map[i][j].setAbsis(j);
				map[i][j].setType(map_entry.charAt((i * col_size) + j));
				map[i][j].setOccupier(' ');
			}
		}
	}

	public int getNumberOfRow()
	{
		return row_size;
	}

	public int getNumberOfColumn()
	{
		return col_size;
	}

	public Tile getTile(int nobaris,int nokolom)
	{
		return map[nobaris][nokolom];
	}

	public Tile getTileOnTop(Tile t)
	{
		return map[t.getOrdinat() - 1][t.getAbsis()];
	}

	public Tile getTileOnleft(Tile t)
	{
		return map[t.getOrdinat()][t.getAbsis() - 1];
	}

	public Tile getTileOnRight(Tile t)
	{
		return map[t.getOrdinat()][t.getAbsis() + 1];
	}

	public Tile getTileBelow(Tile t)
	{
		return map[t.getOrdinat() + 1][t.getAbsis()];
	}

	public Tile getEmptyTileInRowNWithType(int N, char _type)
	{
		int i = N;
		int j;
		boolean found = false;
		while (!found && i < row_size-1)
		{
			j = 1;
			while (!found && j < col_size-1)
			{
				if (map[i][j].getType() == _type && map[i][j].getOccupierCode() == ' ')
				{
					found = true;
				}
				else
				{
					j++;
				}
			}
			if (!found)
			{
				i++;
			}
		}
		return map[i][j];
	}

	public void getSurroundingTile(Tile t, Tile[] surrTile)
	{
		// surrTile = new Tile[4];
		surrTile[0] = getTileOnTop(t);
		surrTile[1] = getTileOnRight(t);
		surrTile[2] = getTileBelow(t);
		surrTile[3] = getTileOnleft(t);
	}

	public void setTileOcc(int nobaris, int nokolom, char occCode)
	{
		map[nobaris][nokolom].setOccupier(occCode);
	}

	public void displayMap()
	{
		for (int i = 1; i < row_size-1; i++)
		{
			for (int j = 1; j < col_size-1; j++)
			{
				if (map[i][j].getOccupierCode() == ' ')
				{
					System.out.print(map[i][j].getType());
					System.out.print(" ");
				}
				else
				{
					System.out.print(map[i][j].getOccupierCode());
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}

