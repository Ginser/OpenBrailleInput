package hugonicolau.openbrailleinput.wordcorrection;

public class ChordDistances {
		
	// Damerau
	static final private int[][] mDamerauDistance = 
		{{0,1,2,2,3,2,3,4,3,2,3,2,3,3,4,3,4,5,4,3,4,3,4,4,4,5,4,4,1,2,2,3,2,3,4,3,2,3,1,1,6,5,4,5,5,5,3,3,3,3,4,2,2,4,3,4,3,2,1,2,3,1,2,2,0},
		{1,0,1,1,2,1,2,3,2,2,3,1,2,2,3,2,3,4,3,3,4,2,3,4,3,4,3,5,1,2,2,3,2,3,4,3,3,4,2,2,5,4,4,5,4,4,3,2,4,2,3,3,1,3,2,3,4,3,2,3,4,2,3,3,1},
		{2,1,0,2,3,2,1,2,1,2,3,1,1,2,3,2,2,3,2,3,4,2,2,4,3,4,3,5,1,2,2,3,2,3,4,3,3,4,2,3,4,3,4,5,3,3,3,1,4,3,2,3,2,2,3,4,4,3,3,4,5,3,4,4,2},
		{2,1,2,0,1,1,1,2,2,1,2,2,3,1,2,2,2,3,3,2,3,3,4,3,2,3,3,4,2,3,2,3,3,3,4,4,3,4,3,3,4,3,3,4,4,3,2,3,3,2,3,2,2,2,1,2,3,4,1,2,3,2,2,3,2},
		{3,2,3,1,0,1,2,1,2,2,1,3,4,2,1,2,3,2,3,3,2,3,4,2,2,2,3,3,3,4,2,3,3,3,4,4,3,4,4,3,3,3,3,3,4,2,2,3,2,2,3,3,2,2,1,1,3,4,2,1,2,2,2,3,3},
		{2,1,2,1,1,0,2,2,1,2,2,2,3,2,2,1,3,3,2,3,3,2,3,3,3,3,2,4,2,3,1,2,2,2,3,3,2,3,3,2,4,4,4,4,3,3,3,2,3,1,2,3,1,3,2,2,4,3,2,2,3,1,3,2,2},
		{3,2,1,1,2,2,0,1,1,1,2,2,2,1,2,2,1,2,2,2,3,3,3,3,2,3,3,4,2,3,2,3,3,3,4,4,3,4,3,4,3,2,3,4,3,2,2,2,3,3,2,2,3,1,2,3,3,4,2,3,4,3,3,4,3},
		{4,3,2,2,1,2,1,0,1,2,1,3,3,2,1,2,2,1,2,3,2,3,3,2,2,2,3,3,3,4,2,3,3,3,4,4,3,4,4,4,2,2,3,3,3,1,2,2,2,3,2,3,3,1,2,2,3,4,3,2,3,3,3,4,4},
		{3,2,1,2,2,1,1,1,0,2,2,2,2,2,2,1,2,2,1,3,3,2,2,3,3,3,2,4,2,3,1,2,2,2,3,3,2,3,3,3,3,3,4,4,2,2,3,1,3,2,1,3,2,2,3,3,4,3,3,3,4,2,4,3,3},
		{2,2,2,1,2,2,1,2,2,0,1,3,3,2,3,3,2,3,3,1,2,4,4,2,3,4,4,3,1,2,1,2,2,2,3,3,2,3,2,3,4,3,2,3,4,3,1,3,2,3,3,1,3,2,2,3,2,3,1,2,3,2,2,3,2},
		{3,3,3,2,1,2,2,1,2,1,0,4,4,3,2,3,3,2,3,2,1,4,4,1,3,3,4,2,2,3,1,2,2,2,3,3,2,3,3,3,3,3,2,2,4,2,1,3,1,3,3,2,3,2,2,2,2,3,2,1,2,2,2,3,3},
		{2,1,1,2,3,2,2,3,2,3,4,0,1,1,2,1,2,3,2,2,3,1,2,5,2,3,2,4,2,1,3,4,3,2,3,2,2,3,1,3,4,3,3,4,3,4,4,2,3,3,3,2,2,3,3,4,3,2,3,4,5,3,4,4,2},
		{3,2,1,3,4,3,2,3,2,3,4,1,0,2,3,2,1,2,1,2,3,2,1,5,3,4,3,5,2,1,3,4,3,2,3,2,3,4,2,4,3,2,3,4,2,4,4,2,4,4,3,3,3,3,4,5,4,3,4,5,6,4,5,5,3},
		{3,2,2,1,2,2,1,2,2,2,3,1,2,0,1,1,1,2,2,1,2,2,3,4,1,2,2,3,3,2,3,4,4,2,3,3,2,3,2,4,3,2,2,3,3,3,3,3,2,3,3,1,3,2,2,3,2,3,2,3,4,3,3,4,3},
		{4,3,3,2,1,2,2,1,2,3,2,2,3,1,0,1,2,1,2,2,1,2,3,3,1,1,2,2,4,3,3,4,4,2,3,3,2,3,3,4,2,2,2,2,3,2,3,3,1,3,3,2,3,2,2,2,2,3,3,2,3,3,3,4,4},
		{3,2,2,2,2,1,2,2,1,3,3,1,2,1,1,0,2,2,1,2,2,1,2,4,2,2,1,3,3,2,2,3,3,1,2,2,1,2,2,3,3,3,3,3,2,3,4,2,2,2,2,2,2,3,3,3,3,2,3,3,4,2,4,3,3},
		{4,3,2,2,3,3,1,2,2,2,3,2,1,1,2,2,0,1,1,1,2,3,2,4,2,3,3,4,3,2,3,4,4,2,3,3,3,4,3,5,2,1,2,3,2,3,3,3,3,4,3,2,4,2,3,4,3,4,3,4,5,4,4,5,4},
		{5,4,3,3,2,3,2,1,2,3,2,3,2,2,1,2,1,0,1,2,1,3,2,3,2,2,3,3,4,3,3,4,4,2,3,3,3,4,4,5,1,1,2,2,2,2,3,3,2,4,3,3,4,2,3,3,3,4,4,3,4,4,4,5,5},
		{4,3,2,3,3,2,2,2,1,3,3,2,1,2,2,1,1,1,0,2,2,2,1,4,3,3,2,4,3,2,2,3,3,1,2,2,2,3,3,4,2,2,3,3,1,3,4,2,3,3,2,3,3,3,4,4,4,3,4,4,5,3,5,4,4},
		{3,3,3,2,3,3,2,3,3,1,2,2,2,1,2,2,1,2,2,0,1,3,3,3,2,3,3,3,2,1,2,3,3,1,2,2,2,3,2,4,3,2,1,2,3,4,2,4,2,4,4,1,4,3,3,4,2,3,2,3,4,3,3,4,3},
		{4,4,4,3,2,3,3,2,3,2,1,3,3,2,1,2,2,1,2,1,0,3,3,2,2,2,3,2,3,2,2,3,3,1,2,2,2,3,3,4,2,2,1,1,3,3,2,4,1,4,4,2,4,3,3,3,2,3,3,2,3,3,3,4,4},
		{3,2,2,3,3,2,3,3,2,4,4,1,2,2,2,1,3,3,2,3,3,0,1,4,1,2,1,3,3,2,3,3,2,2,2,1,2,2,2,2,3,2,2,3,2,3,3,1,3,2,2,3,1,2,2,3,2,1,4,4,4,3,3,3,3},
		{4,3,2,4,4,3,3,3,2,4,4,2,1,3,3,2,2,2,1,3,3,1,0,4,2,3,2,4,3,2,3,3,2,2,2,1,3,3,3,3,2,1,2,3,1,3,3,1,4,3,2,4,2,2,3,4,3,2,5,5,5,4,4,4,4},
		{4,4,4,3,2,3,3,2,3,2,1,5,5,4,3,4,4,3,4,3,2,4,4,0,3,2,3,1,3,4,2,1,2,3,2,3,3,2,4,3,2,3,2,1,3,1,1,3,2,2,2,3,3,2,2,1,2,3,3,2,1,3,2,2,4},
		{4,3,3,2,2,3,2,2,3,3,3,2,3,1,1,2,2,2,3,2,2,1,2,3,0,1,1,2,4,3,4,3,3,3,2,2,3,2,3,3,2,1,1,2,2,2,2,2,2,2,2,2,2,1,1,2,1,2,3,3,3,4,2,3,4},
		{5,4,4,3,2,3,3,2,3,4,3,3,4,2,1,2,3,2,3,3,2,2,3,2,1,0,1,1,5,4,4,3,4,3,2,3,3,2,4,4,1,2,2,1,2,1,3,3,2,2,2,3,3,2,2,1,2,3,4,3,2,4,3,3,5},
		{4,3,3,3,3,2,3,3,2,4,4,2,3,2,2,1,3,3,2,3,3,1,2,3,1,1,0,2,4,3,3,2,3,2,1,2,2,1,3,3,2,2,2,2,1,2,3,2,3,1,1,3,2,2,2,2,2,2,4,4,3,3,3,2,4},
		{4,5,5,4,3,4,4,3,4,3,2,4,5,3,2,3,4,3,4,3,2,3,4,1,2,1,2,0,4,4,3,2,3,3,2,3,2,1,3,3,2,3,2,1,3,2,2,4,1,3,3,2,4,3,3,2,1,2,3,2,1,3,2,2,4},
		{1,1,1,2,3,2,2,3,2,1,2,2,2,3,4,3,3,4,3,2,3,3,3,3,4,5,4,4,0,1,1,2,1,2,3,2,2,3,1,2,5,4,3,4,4,4,2,2,3,3,3,2,2,3,3,4,3,2,2,3,4,2,3,3,1},
		{2,2,2,3,4,3,3,4,3,2,3,1,1,2,3,2,2,3,2,1,2,2,2,4,3,4,3,4,1,0,2,3,2,1,2,1,2,3,1,3,4,3,2,3,3,5,3,3,3,4,4,2,3,4,4,5,3,2,3,4,5,3,4,4,2},
		{2,2,2,2,2,1,2,2,1,1,1,3,3,3,3,2,3,3,2,2,2,3,3,2,4,4,3,3,1,2,0,1,1,1,2,2,1,2,2,2,4,4,3,3,3,3,2,2,2,2,2,2,2,3,3,3,3,2,2,2,3,1,3,2,2},
		{3,3,3,3,3,2,3,3,2,2,2,4,4,4,4,3,4,4,3,3,3,3,3,1,3,3,2,2,2,3,1,0,1,2,1,2,2,1,3,2,3,3,2,2,2,2,1,2,3,1,1,3,2,2,2,2,2,2,3,3,2,2,2,1,3},
		{2,2,2,3,3,2,3,3,2,2,2,3,3,4,4,3,4,4,3,3,3,2,2,2,3,4,3,3,1,2,1,1,0,2,2,1,2,2,2,1,4,3,2,3,3,3,1,1,3,2,2,3,1,2,2,3,2,1,3,3,3,2,2,2,2},
		{3,3,3,3,3,2,3,3,2,2,2,2,2,2,2,1,2,2,1,1,1,2,2,3,3,3,2,3,2,1,1,2,2,0,1,1,1,2,2,3,3,3,2,2,2,4,3,3,2,3,3,2,3,4,4,4,3,2,3,3,4,2,4,3,3},
		{4,4,4,4,4,3,4,4,3,3,3,3,3,3,3,2,3,3,2,2,2,2,2,2,2,2,1,2,3,2,2,1,2,1,0,1,2,1,3,3,2,2,1,1,1,3,2,3,3,2,2,3,3,3,3,3,2,2,4,4,3,3,3,2,4},
		{3,3,3,4,4,3,4,4,3,3,3,2,2,3,3,2,3,3,2,2,2,1,1,3,2,3,2,3,2,1,2,2,1,1,1,0,2,2,2,2,3,2,1,2,2,4,2,2,3,3,3,3,2,3,3,4,2,1,4,4,4,3,3,3,3},
		{2,3,3,3,3,2,3,3,2,2,2,2,3,2,2,1,3,3,2,2,2,2,3,3,3,3,2,2,2,2,1,2,2,1,2,2,0,1,1,2,4,4,3,3,3,4,3,3,1,3,3,1,3,4,4,4,2,1,2,2,3,1,3,2,2},
		{3,4,4,4,4,3,4,4,3,3,3,3,4,3,3,2,4,4,3,3,3,2,3,2,2,2,1,1,3,3,2,1,2,2,1,2,1,0,2,2,3,3,2,2,2,3,2,3,2,2,2,2,3,3,3,3,1,1,3,3,2,2,2,1,3},
		{1,2,2,3,4,3,3,4,3,2,3,1,2,2,3,2,3,4,3,2,3,2,3,4,3,4,3,3,1,1,2,3,2,2,3,2,1,2,0,2,5,4,3,4,4,5,3,3,2,4,4,1,3,4,4,5,2,1,2,3,4,2,3,3,1},
		{1,2,3,3,3,2,4,4,3,3,3,3,4,4,4,3,5,5,4,4,4,2,3,3,3,4,3,3,2,3,2,2,1,3,3,2,2,2,2,0,5,4,3,4,4,4,2,2,3,2,3,3,1,3,2,3,2,1,2,2,2,1,1,1,1},
		{6,5,4,4,3,4,3,2,3,4,3,4,3,3,2,3,2,1,2,3,2,3,2,2,2,1,2,2,5,4,4,3,4,3,2,3,4,3,5,5,0,1,2,1,1,1,3,3,3,3,2,4,4,2,3,2,3,4,5,4,3,5,4,4,6},
		{5,4,3,3,3,4,2,2,3,3,3,3,2,2,2,3,1,1,2,2,2,2,1,3,1,2,2,3,4,3,4,3,3,3,2,2,4,3,4,4,1,0,1,2,1,2,2,2,3,3,2,3,3,1,2,3,2,3,4,4,4,5,3,4,5},
		{4,4,4,3,3,4,3,3,4,2,2,3,3,2,2,3,2,2,3,1,1,2,2,2,1,2,2,2,3,2,3,2,2,2,1,1,3,2,3,3,2,1,0,1,2,3,1,3,2,3,3,2,3,2,2,3,1,2,3,3,3,4,2,3,4},
		{5,5,5,4,3,4,4,3,4,3,2,4,4,3,2,3,3,2,3,2,1,3,3,1,2,1,2,1,4,3,3,2,3,2,1,2,3,2,4,4,1,2,1,0,2,2,2,4,2,3,3,3,4,3,3,2,2,3,4,3,2,4,3,3,5},
		{5,4,3,4,4,3,3,3,2,4,4,3,2,3,3,2,2,2,1,3,3,2,1,3,2,2,1,3,4,3,3,2,3,2,1,2,3,2,4,4,1,1,2,2,0,2,3,2,4,2,1,4,3,2,3,3,3,3,5,5,4,4,4,3,5},
		{5,4,3,3,2,3,2,1,2,3,2,4,4,3,2,3,3,2,3,4,3,3,3,1,2,1,2,2,4,5,3,2,3,4,3,4,4,3,5,4,1,2,3,2,2,0,2,2,3,2,1,4,3,1,2,1,3,4,4,3,2,4,3,3,5},
		{3,3,3,2,2,3,2,2,3,1,1,4,4,3,3,4,3,3,4,2,2,3,3,1,2,3,3,2,2,3,2,1,1,3,2,2,3,2,3,2,3,2,1,2,3,2,0,2,2,2,2,2,2,1,1,2,1,2,2,2,2,3,1,2,3},
		{3,2,1,3,3,2,2,2,1,3,3,2,2,3,3,2,3,3,2,4,4,1,1,3,2,3,2,4,2,3,2,2,1,3,3,2,3,3,3,2,3,2,3,4,2,2,2,0,4,2,1,4,1,1,2,3,3,2,4,4,4,3,3,3,3},
		{3,4,4,3,2,3,3,2,3,2,1,3,4,2,1,2,3,2,3,2,1,3,4,2,2,2,3,1,3,3,2,3,3,2,3,3,1,2,2,3,3,3,2,2,4,3,2,4,0,4,4,1,4,3,3,3,1,2,2,1,2,2,2,3,3},
		{3,2,3,2,2,1,3,3,2,3,3,3,4,3,3,2,4,4,3,4,4,2,3,2,2,2,1,3,3,4,2,1,2,3,2,3,3,2,4,2,3,3,3,3,2,2,2,2,4,0,1,4,1,2,1,1,3,3,3,3,2,2,2,1,3},
		{4,3,2,3,3,2,2,2,1,3,3,3,3,3,3,2,3,3,2,4,4,2,2,2,2,2,1,3,3,4,2,1,2,3,2,3,3,2,4,3,2,2,3,3,1,1,2,1,4,1,0,4,2,1,2,2,3,3,4,4,3,3,3,2,4},
		{2,3,3,2,3,3,2,3,3,1,2,2,3,1,2,2,2,3,3,1,2,3,4,3,2,3,3,2,2,2,2,3,3,2,3,3,1,2,1,3,4,3,2,3,4,4,2,4,1,4,4,0,4,3,3,4,1,2,1,2,3,2,2,3,2},
		{2,1,2,2,2,1,3,3,2,3,3,2,3,3,3,2,4,4,3,4,4,1,2,3,2,3,2,4,2,3,2,2,1,3,3,2,3,3,3,1,4,3,3,4,3,3,2,1,4,1,2,4,0,2,1,2,3,2,3,3,3,2,2,2,2},
		{4,3,2,2,2,3,1,1,2,2,2,3,3,2,2,3,2,2,3,3,3,2,2,2,1,2,2,3,3,4,3,2,2,4,3,3,4,3,4,3,2,1,2,3,2,1,1,1,3,2,1,3,2,0,1,2,2,3,3,3,3,4,2,3,4},
		{3,2,3,1,1,2,2,2,3,2,2,3,4,2,2,3,3,3,4,3,3,2,3,2,1,2,2,3,3,4,3,2,2,4,3,3,4,3,4,2,3,2,2,3,3,2,1,2,3,1,2,3,1,1,0,1,2,3,2,2,2,3,1,2,3},
		{4,3,4,2,1,2,3,2,3,3,2,4,5,3,2,3,4,3,4,4,3,3,4,1,2,1,2,2,4,5,3,2,3,4,3,4,4,3,5,3,2,3,3,2,3,1,2,3,3,1,2,4,2,2,1,0,3,4,3,2,1,3,2,2,4},
		{3,4,4,3,3,4,3,3,4,2,2,3,4,2,2,3,3,3,4,2,2,2,3,2,1,2,2,1,3,3,3,2,2,3,2,2,2,1,2,2,3,2,1,2,3,3,1,3,1,3,3,1,3,2,2,3,0,1,2,2,2,3,1,2,3},
		{2,3,3,4,4,3,4,4,3,3,3,2,3,3,3,2,4,4,3,3,3,1,2,3,2,3,2,2,2,2,2,2,1,2,2,1,1,1,1,1,4,3,2,3,3,4,2,2,2,3,3,2,2,3,3,4,1,0,3,3,3,2,2,2,2},
		{1,2,3,1,2,2,2,3,3,1,2,3,4,2,3,3,3,4,4,2,3,4,5,3,3,4,4,3,2,3,2,3,3,3,4,4,2,3,2,2,5,4,3,4,5,4,2,4,2,3,4,1,3,3,2,3,2,3,0,1,2,1,1,2,1},
		{2,3,4,2,1,2,3,2,3,2,1,4,5,3,2,3,4,3,4,3,2,4,5,2,3,3,4,2,3,4,2,3,3,3,4,4,2,3,3,2,4,4,3,3,5,3,2,4,1,3,4,2,3,3,2,2,2,3,1,0,1,1,1,2,2},
		{3,4,5,3,2,3,4,3,4,3,2,5,6,4,3,4,5,4,5,4,3,4,5,1,3,2,3,1,4,5,3,2,3,4,3,4,3,2,4,2,3,4,3,2,4,2,2,4,2,2,3,3,3,3,2,1,2,3,2,1,0,2,1,1,3},
		{1,2,3,2,2,1,3,3,2,2,2,3,4,3,3,2,4,4,3,3,3,3,4,3,4,4,3,3,2,3,1,2,2,2,3,3,1,2,2,1,5,5,4,4,4,4,3,3,2,2,3,2,2,4,3,3,3,2,1,1,2,0,2,1,1},
		{2,3,4,2,2,3,3,3,4,2,2,4,5,3,3,4,4,4,5,3,3,3,4,2,2,3,3,2,3,4,3,2,2,4,3,3,3,2,3,1,4,3,2,3,4,3,1,3,2,2,3,2,2,2,1,2,1,2,1,1,1,2,0,1,2},
		{2,3,4,3,3,2,4,4,3,3,3,4,5,4,4,3,5,5,4,4,4,3,4,2,3,3,2,2,3,4,2,1,2,3,2,3,2,1,3,1,4,4,3,3,3,3,2,3,3,1,2,3,2,3,2,2,2,2,2,2,1,1,1,0,2},
		{0,1,2,2,3,2,3,4,3,2,3,2,3,3,4,3,4,5,4,3,4,3,4,4,4,5,4,4,1,2,2,3,2,3,4,3,2,3,1,1,6,5,4,5,5,5,3,3,3,3,4,2,2,4,3,4,3,2,1,2,3,1,2,2,0}};
			
	// Damerau PT
	static final private int[][] mDamerauDistancePT = 
		{{0,1,2,2,3,2,3,4,3,2,3,2,3,3,4,3,4,5,4,3,4,3,4,4,4,5,4,4,1,2,2,3,2,3,4,3,2,3,1,1,6,5,4,5,5,5,3,3,3,3,4,2,2,4,3,4,3,2,1,2,3,1,2,2},
		{1,0,1,1,2,1,2,3,2,2,3,1,2,2,3,2,3,4,3,3,4,2,3,4,3,4,3,5,1,2,2,3,2,3,4,3,3,4,2,2,5,4,4,5,0,4,3,2,0,2,3,3,0,0,2,3,4,3,2,3,4,2,3,3},
		{2,1,0,2,3,2,1,2,1,2,3,1,1,2,3,2,2,3,2,3,4,2,2,4,3,4,3,5,1,2,2,3,2,3,4,3,3,4,2,3,4,3,4,5,3,3,3,1,4,3,2,3,2,2,3,4,4,3,3,4,5,3,4,4},
		{2,1,2,0,1,1,1,2,2,1,2,2,3,1,2,2,2,3,3,2,3,3,4,3,2,3,3,4,2,3,2,3,3,3,4,4,3,4,3,3,4,0,3,4,4,3,2,3,3,2,3,2,2,2,1,2,3,4,1,2,3,2,2,3},
		{3,2,3,1,0,1,2,1,2,2,1,3,4,2,1,2,3,2,3,3,2,3,4,2,2,2,3,3,3,4,2,3,3,3,4,4,3,4,4,3,3,3,3,3,4,2,2,3,2,2,3,3,2,2,1,1,3,4,2,1,2,2,2,3},
		{2,1,2,1,1,0,2,2,1,2,2,2,3,2,2,1,3,3,2,3,3,2,3,3,3,3,2,4,2,3,1,2,2,2,3,3,2,3,3,2,0,4,0,4,3,3,3,0,3,1,2,3,1,3,2,2,4,3,2,2,3,1,3,2},
		{3,2,1,1,2,2,0,1,1,1,2,2,2,1,2,2,1,2,2,2,3,3,3,3,2,3,3,4,2,3,2,3,3,3,4,4,3,4,3,4,3,2,3,4,3,2,2,2,3,3,2,2,3,1,2,3,3,4,2,3,4,3,3,4},
		{4,3,2,2,1,2,1,0,1,2,1,3,3,2,1,2,2,1,2,3,2,3,3,2,2,2,3,3,3,4,2,3,3,3,4,4,3,4,4,4,2,2,3,3,3,1,2,2,2,3,2,3,3,1,2,2,3,4,3,2,3,3,3,4},
		{3,2,1,2,2,1,1,1,0,2,2,2,2,2,2,1,2,2,1,3,3,2,2,3,3,3,2,4,2,3,1,2,2,2,3,3,2,3,3,3,3,3,4,4,2,2,3,1,3,2,1,3,2,2,3,3,4,3,3,3,4,2,4,3},
		{2,2,2,1,2,2,1,2,2,0,1,3,3,2,3,3,2,3,3,1,2,4,4,2,3,4,4,3,1,2,1,2,2,2,3,3,2,3,2,3,4,3,2,3,4,0,1,3,2,3,3,0,3,2,0,3,2,3,1,2,3,2,2,3},
		{3,3,3,2,1,2,2,1,2,1,0,4,4,3,2,3,3,2,3,2,1,4,4,1,3,3,4,2,2,3,1,2,2,2,3,3,2,3,3,3,3,3,2,2,4,2,1,3,1,3,3,2,3,2,2,2,2,3,2,1,2,2,2,3},
		{2,1,1,2,3,2,2,3,2,3,4,0,1,1,2,1,2,3,2,2,3,1,2,5,2,3,2,4,2,1,3,4,3,2,3,2,2,3,1,3,4,3,3,4,3,4,4,2,3,3,3,2,2,3,3,4,3,2,3,4,5,3,4,4},
		{3,2,1,3,4,3,2,3,2,3,4,1,0,2,3,2,1,2,1,2,3,2,1,5,3,4,3,5,2,1,3,4,3,2,3,2,3,4,2,4,3,2,3,4,2,4,4,2,4,4,3,3,3,3,4,5,4,3,4,5,6,4,5,5},
		{3,2,2,1,2,2,1,2,2,2,3,1,2,0,1,1,1,2,2,1,2,2,3,4,1,2,2,3,3,2,3,4,4,2,3,3,2,3,2,4,3,2,2,3,3,3,3,3,2,3,3,1,3,2,2,3,2,3,2,3,4,3,3,4},
		{4,3,3,2,1,2,2,1,2,3,2,2,3,1,0,1,2,1,2,2,1,2,3,3,1,1,2,2,4,3,3,4,4,2,3,3,2,3,3,4,2,2,2,2,3,2,3,3,1,3,3,2,3,2,2,2,2,3,3,2,3,3,3,4},
		{3,2,2,2,2,1,2,2,1,3,3,1,2,1,1,0,2,2,1,2,2,1,2,4,2,2,1,3,3,2,2,3,3,1,2,2,1,2,2,3,3,3,3,3,2,3,0,2,2,2,2,2,2,3,3,0,0,2,3,3,4,2,4,3},
		{4,3,2,2,3,3,1,2,2,2,3,2,1,1,2,2,0,1,1,1,2,3,2,4,2,3,3,4,3,2,3,4,4,2,3,3,3,4,3,5,2,1,2,3,2,3,3,3,3,4,3,2,4,2,3,4,3,4,3,4,5,4,4,5},
		{5,4,3,3,2,3,2,1,2,3,2,3,2,2,1,2,1,0,1,2,1,3,2,3,2,2,3,3,4,3,3,4,4,2,3,3,3,4,4,5,1,1,2,2,2,2,3,3,2,4,3,3,4,2,3,3,3,4,4,3,4,4,4,5},
		{4,3,2,3,3,2,2,2,1,3,3,2,1,2,2,1,1,1,0,2,2,2,1,4,3,3,2,4,3,2,2,3,3,1,2,2,2,3,3,4,2,2,3,3,1,3,4,2,3,3,2,3,3,3,4,4,4,3,4,4,5,3,5,4},
		{3,3,3,2,3,3,2,3,3,1,2,2,2,1,2,2,1,2,2,0,1,3,3,3,2,3,3,3,2,1,2,3,3,1,2,2,2,3,2,4,3,2,1,2,3,4,2,4,2,4,4,1,4,3,3,4,2,3,2,3,4,3,3,4},
		{4,4,4,3,2,3,3,2,3,2,1,3,3,2,1,2,2,1,2,1,0,3,3,2,2,2,3,2,3,2,2,3,3,1,2,2,2,3,3,4,2,2,1,1,3,3,2,4,1,4,4,2,4,3,3,3,2,3,3,2,3,3,3,4},
		{3,2,2,3,3,2,3,3,2,4,4,1,2,2,2,1,3,3,2,3,3,0,1,4,1,2,1,3,3,2,3,3,2,2,2,1,2,2,2,2,3,2,2,0,2,3,3,1,3,2,0,3,1,2,2,3,2,1,4,4,4,3,3,3},
		{4,3,2,4,4,3,3,3,2,4,4,2,1,3,3,2,2,2,1,3,3,1,0,4,2,3,2,4,3,2,3,3,2,2,2,1,3,3,3,3,2,1,2,3,1,3,3,1,4,3,2,4,2,2,3,4,3,2,5,5,5,4,4,4},
		{4,4,4,3,2,3,3,2,3,2,1,5,5,4,3,4,4,3,4,3,2,4,4,0,3,2,3,1,3,4,2,1,2,3,2,3,3,2,4,3,2,3,2,1,3,1,1,3,2,2,2,3,3,2,2,1,2,3,3,2,1,3,2,2},
		{4,3,3,2,2,3,2,2,3,3,3,2,3,1,1,2,2,2,3,2,2,1,2,3,0,1,1,2,4,3,4,3,3,3,2,2,3,2,3,3,2,1,1,2,2,2,2,2,2,2,2,2,2,1,1,2,1,2,3,3,3,4,2,3},
		{5,4,4,3,2,3,3,2,3,4,3,3,4,2,1,2,3,2,3,3,2,2,3,2,1,0,1,1,5,4,4,3,4,3,2,3,3,2,4,4,1,2,2,1,2,1,3,3,2,2,2,3,3,2,2,1,2,3,4,3,2,4,3,3},
		{4,3,3,3,3,2,3,3,2,4,4,2,3,2,2,1,3,3,2,3,3,1,2,3,1,1,0,2,4,3,3,2,3,2,1,2,2,1,3,3,2,2,2,2,1,2,3,2,3,1,1,3,2,2,2,2,2,2,4,4,3,3,3,2},
		{4,5,5,4,3,4,4,3,4,3,2,4,5,3,2,3,4,3,4,3,2,3,4,1,2,1,2,0,4,4,3,2,3,3,2,3,2,1,3,3,2,3,2,1,3,2,2,4,1,3,3,2,4,3,3,2,1,2,3,2,1,3,2,2},
		{1,1,1,2,3,2,2,3,2,1,2,2,2,3,4,3,3,4,3,2,3,3,3,3,4,5,4,4,0,1,1,2,1,2,3,2,2,3,1,2,5,4,3,4,4,4,2,2,3,3,3,2,2,3,3,4,3,2,2,3,4,2,3,3},
		{2,2,2,3,4,3,3,4,3,2,3,1,1,2,3,2,2,3,2,1,2,2,2,4,3,4,3,4,1,0,2,3,2,1,2,1,2,3,1,3,4,3,2,3,3,5,3,3,3,4,4,2,3,4,4,5,3,2,3,4,5,3,4,4},
		{2,2,2,2,2,1,2,2,1,1,1,3,3,3,3,2,3,3,2,2,2,3,3,2,4,4,3,3,1,2,0,1,1,1,2,2,1,2,2,2,4,4,3,3,3,3,2,2,2,2,2,2,2,3,3,3,3,2,2,2,3,1,3,2},
		{3,3,3,3,3,2,3,3,2,2,2,4,4,4,4,3,4,4,3,3,3,3,3,1,3,3,2,2,2,3,1,0,1,2,1,2,2,1,3,2,3,3,2,2,2,2,1,2,3,1,1,3,2,2,2,2,2,2,3,3,2,2,2,1},
		{2,2,2,3,3,2,3,3,2,2,2,3,3,4,4,3,4,4,3,3,3,2,2,2,3,4,3,3,1,2,1,1,0,2,2,1,2,2,2,1,4,3,2,3,3,3,1,1,3,2,2,3,1,2,2,3,2,1,3,3,3,2,2,2},
		{3,3,3,3,3,2,3,3,2,2,2,2,2,2,2,1,2,2,1,1,1,2,2,3,3,3,2,3,2,1,1,2,2,0,1,1,1,2,2,3,3,3,2,2,2,4,3,3,2,3,3,2,3,4,4,4,3,2,3,3,4,2,4,3},
		{4,4,4,4,4,3,4,4,3,3,3,3,3,3,3,2,3,3,2,2,2,2,2,2,2,2,1,2,3,2,2,1,2,1,0,1,2,1,3,3,2,2,1,1,1,3,2,3,3,2,2,3,3,3,3,3,2,2,4,4,3,3,3,2},
		{3,3,3,4,4,3,4,4,3,3,3,2,2,3,3,2,3,3,2,2,2,1,1,3,2,3,2,3,2,1,2,2,1,1,1,0,2,2,2,2,3,2,1,2,2,4,2,2,3,3,3,3,2,3,3,4,2,1,4,4,4,3,3,3},
		{2,3,3,3,3,2,3,3,2,2,2,2,3,2,2,1,3,3,2,2,2,2,3,3,3,3,2,2,2,2,1,2,2,1,2,2,0,1,1,2,4,4,3,3,3,4,3,3,1,3,3,1,3,4,4,4,2,1,2,2,3,1,3,2},
		{3,4,4,4,4,3,4,4,3,3,3,3,4,3,3,2,4,4,3,3,3,2,3,2,2,2,1,1,3,3,2,1,2,2,1,2,1,0,2,2,3,3,2,2,2,3,2,3,2,2,2,2,3,3,3,3,1,1,3,3,2,2,2,1},
		{1,2,2,3,4,3,3,4,3,2,3,1,2,2,3,2,3,4,3,2,3,2,3,4,3,4,3,3,1,1,2,3,2,2,3,2,1,2,0,2,5,4,3,4,4,5,3,3,2,4,4,1,3,4,4,5,2,1,2,3,4,2,3,3},
		{1,2,3,3,3,2,4,4,3,3,3,3,4,4,4,3,5,5,4,4,4,2,3,3,3,4,3,3,2,3,2,2,1,3,3,2,2,2,2,0,5,4,3,4,4,4,2,2,3,2,3,3,1,3,2,3,2,1,2,2,2,1,1,1},
		{6,5,4,4,3,0,3,2,3,4,3,4,3,3,2,3,2,1,2,3,2,3,2,2,2,1,2,2,5,4,4,3,4,3,2,3,4,3,5,5,0,1,0,1,1,1,3,0,3,3,2,4,4,2,3,2,3,4,5,4,3,5,4,4},
		{5,4,3,0,3,4,2,2,3,3,3,3,2,2,2,3,1,1,2,2,2,2,1,3,1,2,2,3,4,3,4,3,3,3,2,2,4,3,4,4,1,0,1,2,1,2,2,2,3,3,2,3,3,1,2,3,2,3,4,4,4,5,3,4},
		{4,4,4,3,3,0,3,3,4,2,2,3,3,2,2,3,2,2,3,1,1,2,2,2,1,2,2,2,3,2,3,2,2,2,1,1,3,2,3,3,0,1,0,1,2,3,1,0,2,3,3,2,3,2,2,3,1,2,3,3,3,4,2,3},
		{5,5,5,4,3,4,4,3,4,3,2,4,4,3,2,3,3,2,3,2,1,0,3,1,2,1,2,1,4,3,3,2,3,2,1,2,3,2,4,4,1,2,1,0,2,2,2,4,2,3,0,3,4,3,3,2,2,3,4,3,2,4,3,3},
		{5,0,3,4,4,3,3,3,2,4,4,3,2,3,3,2,2,2,1,3,3,2,1,3,2,2,1,3,4,3,3,2,3,2,1,2,3,2,4,4,1,1,2,2,0,2,3,2,0,2,1,4,0,0,3,3,3,3,5,5,4,4,4,3},
		{5,4,3,3,2,3,2,1,2,0,2,4,4,3,2,3,3,2,3,4,3,3,3,1,2,1,2,2,4,5,3,2,3,4,3,4,4,3,5,4,1,2,3,2,2,0,2,2,3,2,1,0,3,1,0,1,3,4,4,3,2,4,3,3},
		{3,3,3,2,2,3,2,2,3,1,1,4,4,3,3,0,3,3,4,2,2,3,3,1,2,3,3,2,2,3,2,1,1,3,2,2,3,2,3,2,3,2,1,2,3,2,0,2,2,2,2,2,2,1,1,0,0,2,2,2,2,3,1,2},
		{3,2,1,3,3,0,2,2,1,3,3,2,2,3,3,2,3,3,2,4,4,1,1,3,2,3,2,4,2,3,2,2,1,3,3,2,3,3,3,2,0,2,0,4,2,2,2,0,4,2,1,4,1,1,2,3,3,2,4,4,4,3,3,3},
		{3,0,4,3,2,3,3,2,3,2,1,3,4,2,1,2,3,2,3,2,1,3,4,2,2,2,3,1,3,3,2,3,3,2,3,3,1,2,2,3,3,3,2,2,0,3,2,4,0,4,4,1,0,0,3,3,1,2,2,1,2,2,2,3},
		{3,2,3,2,2,1,3,3,2,3,3,3,4,3,3,2,4,4,3,4,4,2,3,2,2,2,1,3,3,4,2,1,2,3,2,3,3,2,4,2,3,3,3,3,2,2,2,2,4,0,1,4,1,2,1,1,3,3,3,3,2,2,2,1},
		{4,3,2,3,3,2,2,2,1,3,3,3,3,3,3,2,3,3,2,4,4,0,2,2,2,2,1,3,3,4,2,1,2,3,2,3,3,2,4,3,2,2,3,0,1,1,2,1,4,1,0,4,2,1,2,2,3,3,4,4,3,3,3,2},
		{2,3,3,2,3,3,2,3,3,0,2,2,3,1,2,2,2,3,3,1,2,3,4,3,2,3,3,2,2,2,2,3,3,2,3,3,1,2,1,3,4,3,2,3,4,0,2,4,1,4,4,0,4,3,0,4,1,2,1,2,3,2,2,3},
		{2,0,2,2,2,1,3,3,2,3,3,2,3,3,3,2,4,4,3,4,4,1,2,3,2,3,2,4,2,3,2,2,1,3,3,2,3,3,3,1,4,3,3,4,0,3,2,1,0,1,2,4,0,0,1,2,3,2,3,3,3,2,2,2},
		{4,0,2,2,2,3,1,1,2,2,2,3,3,2,2,3,2,2,3,3,3,2,2,2,1,2,2,3,3,4,3,2,2,4,3,3,4,3,4,3,2,1,2,3,0,1,1,1,0,2,1,3,0,0,1,2,2,3,3,3,3,4,2,3},
		{3,2,3,1,1,2,2,2,3,0,2,3,4,2,2,3,3,3,4,3,3,2,3,2,1,2,2,3,3,4,3,2,2,4,3,3,4,3,4,2,3,2,2,3,3,0,1,2,3,1,2,0,1,1,0,1,2,3,2,2,2,3,1,2},
		{4,3,4,2,1,2,3,2,3,3,2,4,5,3,2,0,4,3,4,4,3,3,4,1,2,1,2,2,4,5,3,2,3,4,3,4,4,3,5,3,2,3,3,2,3,1,0,3,3,1,2,4,2,2,1,0,0,4,3,2,1,3,2,2},
		{3,4,4,3,3,4,3,3,4,2,2,3,4,2,2,0,3,3,4,2,2,2,3,2,1,2,2,1,3,3,3,2,2,3,2,2,2,1,2,2,3,2,1,2,3,3,0,3,1,3,3,1,3,2,2,0,0,1,2,2,2,3,1,2},
		{2,3,3,4,4,3,4,4,3,3,3,2,3,3,3,2,4,4,3,3,3,1,2,3,2,3,2,2,2,2,2,2,1,2,2,1,1,1,1,1,4,3,2,3,3,4,2,2,2,3,3,2,2,3,3,4,1,0,3,3,3,2,2,2},
		{1,2,3,1,2,2,2,3,3,1,2,3,4,2,3,3,3,4,4,2,3,4,5,3,3,4,4,3,2,3,2,3,3,3,4,4,2,3,2,2,5,4,3,4,5,4,2,4,2,3,4,1,3,3,2,3,2,3,0,1,2,1,1,2},
		{2,3,4,2,1,2,3,2,3,2,1,4,5,3,2,3,4,3,4,3,2,4,5,2,3,3,4,2,3,4,2,3,3,3,4,4,2,3,3,2,4,4,3,3,5,3,2,4,1,3,4,2,3,3,2,2,2,3,1,0,1,1,1,2},
		{3,4,5,3,2,3,4,3,4,3,2,5,6,4,3,4,5,4,5,4,3,4,5,1,3,2,3,1,4,5,3,2,3,4,3,4,3,2,4,2,3,4,3,2,4,2,2,4,2,2,3,3,3,3,2,1,2,3,2,1,0,2,1,1},
		{1,2,3,2,2,1,3,3,2,2,2,3,4,3,3,2,4,4,3,3,3,3,4,3,4,4,3,3,2,3,1,2,2,2,3,3,1,2,2,1,5,5,4,4,4,4,3,3,2,2,3,2,2,4,3,3,3,2,1,1,2,0,2,1},
		{2,3,4,2,2,3,3,3,4,2,2,4,5,3,3,4,4,4,5,3,3,3,4,2,2,3,3,2,3,4,3,2,2,4,3,3,3,2,3,1,4,3,2,3,4,3,1,3,2,2,3,2,2,2,1,2,1,2,1,1,1,2,0,1},
		{2,3,4,3,3,2,4,4,3,3,3,4,5,4,4,3,5,5,4,4,4,3,4,2,3,3,2,2,3,4,2,1,2,3,2,3,2,1,3,1,4,4,3,3,3,3,2,3,3,1,2,3,2,3,2,2,2,2,2,2,1,1,1,0}};
	
	// Damerau PT
	static final private int[][] mDamerauDistanceEN = 
		{{0,1,2,2,3,2,3,4,3,2,3,2,3,3,4,3,4,5,4,3,4,3,4,4,4,5,4,4,1,2,2,3,2,3,4,3,2,3,1,1,6,5,4,5,5,5,3,3,3,3,4,2,2,4,3,4,3,2,1,2,3,1,2,2},
		{1,0,1,1,2,1,2,3,2,2,3,1,2,2,3,2,3,4,3,3,4,2,3,4,3,4,3,5,1,2,2,3,2,3,4,3,3,4,2,2,5,4,4,5,4,4,3,2,4,2,3,3,1,3,2,3,4,3,2,3,4,2,3,3},
		{2,1,0,2,3,2,1,2,1,2,3,1,1,2,3,2,2,3,2,3,4,2,2,4,3,4,3,5,1,2,2,3,2,3,4,3,3,4,2,3,4,3,4,5,3,3,3,1,4,3,2,3,2,2,3,4,4,3,3,4,5,3,4,4},
		{2,1,2,0,1,1,1,2,2,1,2,2,3,1,2,2,2,3,3,2,3,3,4,3,2,3,3,4,2,3,2,3,3,3,4,4,3,4,3,3,4,3,3,4,4,3,2,3,3,2,3,2,2,2,1,2,3,4,1,2,3,2,2,3},
		{3,2,3,1,0,1,2,1,2,2,1,3,4,2,1,2,3,2,3,3,2,3,4,2,2,2,3,3,3,4,2,3,3,3,4,4,3,4,4,3,3,3,3,3,4,2,2,3,2,2,3,3,2,2,1,1,3,4,2,1,2,2,2,3},
		{2,1,2,1,1,0,2,2,1,2,2,2,3,2,2,1,3,3,2,3,3,2,3,3,3,3,2,4,2,3,1,2,2,2,3,3,2,3,3,2,4,4,4,4,3,3,3,2,3,1,2,3,1,3,2,2,4,3,2,2,3,1,3,2},
		{3,2,1,1,2,2,0,1,1,1,2,2,2,1,2,2,1,2,2,2,3,3,3,3,2,3,3,4,2,3,2,3,3,3,4,4,3,4,3,4,3,2,3,4,3,2,2,2,3,3,2,2,3,1,2,3,3,4,2,3,4,3,3,4},
		{4,3,2,2,1,2,1,0,1,2,1,3,3,2,1,2,2,1,2,3,2,3,3,2,2,2,3,3,3,4,2,3,3,3,4,4,3,4,4,4,2,2,3,3,3,1,2,2,2,3,2,3,3,1,2,2,3,4,3,2,3,3,3,4},
		{3,2,1,2,2,1,1,1,0,2,2,2,2,2,2,1,2,2,1,3,3,2,2,3,3,3,2,4,2,3,1,2,2,2,3,3,2,3,3,3,3,3,4,4,2,2,3,1,3,2,1,3,2,2,3,3,4,3,3,3,4,2,4,3},
		{2,2,2,1,2,2,1,2,2,0,1,3,3,2,3,3,2,3,3,1,2,4,4,2,3,4,4,3,1,2,1,2,2,2,3,3,2,3,2,3,4,3,2,3,4,3,1,3,2,3,3,1,3,2,2,3,2,3,1,2,3,2,2,3},
		{3,3,3,2,1,2,2,1,2,1,0,4,4,3,2,3,3,2,3,2,1,4,4,1,3,3,4,2,2,3,1,2,2,2,3,3,2,3,3,3,3,3,2,2,4,2,1,3,1,3,3,2,3,2,2,2,2,3,2,1,2,2,2,3},
		{2,1,1,2,3,2,2,3,2,3,4,0,1,1,2,1,2,3,2,2,3,1,2,5,2,3,2,4,2,1,3,4,3,2,3,2,2,3,1,3,4,3,3,4,3,4,4,2,3,3,3,2,2,3,3,4,3,2,3,4,5,3,4,4},
		{3,2,1,3,4,3,2,3,2,3,4,1,0,2,3,2,1,2,1,2,3,2,1,5,3,4,3,5,2,1,3,4,3,2,3,2,3,4,2,4,3,2,3,4,2,4,4,2,4,4,3,3,3,3,4,5,4,3,4,5,6,4,5,5},
		{3,2,2,1,2,2,1,2,2,2,3,1,2,0,1,1,1,2,2,1,2,2,3,4,1,2,2,3,3,2,3,4,4,2,3,3,2,3,2,4,3,2,2,3,3,3,3,3,2,3,3,1,3,2,2,3,2,3,2,3,4,3,3,4},
		{4,3,3,2,1,2,2,1,2,3,2,2,3,1,0,1,2,1,2,2,1,2,3,3,1,1,2,2,4,3,3,4,4,2,3,3,2,3,3,4,2,2,2,2,3,2,3,3,1,3,3,2,3,2,2,2,2,3,3,2,3,3,3,4},
		{3,2,2,2,2,1,2,2,1,3,3,1,2,1,1,0,2,2,1,2,2,1,2,4,2,2,1,3,3,2,2,3,3,1,2,2,1,2,2,3,3,3,3,3,2,3,4,2,2,2,2,2,2,3,3,3,3,2,3,3,4,2,4,3},
		{4,3,2,2,3,3,1,2,2,2,3,2,1,1,2,2,0,1,1,1,2,3,2,4,2,3,3,4,3,2,3,4,4,2,3,3,3,4,3,5,2,1,2,3,2,3,3,3,3,4,3,2,4,2,3,4,3,4,3,4,5,4,4,5},
		{5,4,3,3,2,3,2,1,2,3,2,3,2,2,1,2,1,0,1,2,1,3,2,3,2,2,3,3,4,3,3,4,4,2,3,3,3,4,4,5,1,1,2,2,2,2,3,3,2,4,3,3,4,2,3,3,3,4,4,3,4,4,4,5},
		{4,3,2,3,3,2,2,2,1,3,3,2,1,2,2,1,1,1,0,2,2,2,1,4,3,3,2,4,3,2,2,3,3,1,2,2,2,3,3,4,2,2,3,3,1,3,4,2,3,3,2,3,3,3,4,4,4,3,4,4,5,3,5,4},
		{3,3,3,2,3,3,2,3,3,1,2,2,2,1,2,2,1,2,2,0,1,3,3,3,2,3,3,3,2,1,2,3,3,1,2,2,2,3,2,4,3,2,1,2,3,4,2,4,2,4,4,1,4,3,3,4,2,3,2,3,4,3,3,4},
		{4,4,4,3,2,3,3,2,3,2,1,3,3,2,1,2,2,1,2,1,0,3,3,2,2,2,3,2,3,2,2,3,3,1,2,2,2,3,3,4,2,2,1,1,3,3,2,4,1,4,4,2,4,3,3,3,2,3,3,2,3,3,3,4},
		{3,2,2,3,3,2,3,3,2,4,4,1,2,2,2,1,3,3,2,3,3,0,1,4,1,2,1,3,3,2,3,3,2,2,2,1,2,2,2,2,3,2,2,3,2,3,3,1,3,2,2,3,1,2,2,3,2,1,4,4,4,3,3,3},
		{4,3,2,4,4,3,3,3,2,4,4,2,1,3,3,2,2,2,1,3,3,1,0,4,2,3,2,4,3,2,3,3,2,2,2,1,3,3,3,3,2,1,2,3,1,3,3,1,4,3,2,4,2,2,3,4,3,2,5,5,5,4,4,4},
		{4,4,4,3,2,3,3,2,3,2,1,5,5,4,3,4,4,3,4,3,2,4,4,0,3,2,3,1,3,4,2,1,2,3,2,3,3,2,4,3,2,3,2,1,3,1,1,3,2,2,2,3,3,2,2,1,2,3,3,2,1,3,2,2},
		{4,3,3,2,2,3,2,2,3,3,3,2,3,1,1,2,2,2,3,2,2,1,2,3,0,1,1,2,4,3,4,3,3,3,2,2,3,2,3,3,2,1,1,2,2,2,2,2,2,2,2,2,2,1,1,2,1,2,3,3,3,4,2,3},
		{5,4,4,3,2,3,3,2,3,4,3,3,4,2,1,2,3,2,3,3,2,2,3,2,1,0,1,1,5,4,4,3,4,3,2,3,3,2,4,4,1,2,2,1,2,1,3,3,2,2,2,3,3,2,2,1,2,3,4,3,2,4,3,3},
		{4,3,3,3,3,2,3,3,2,4,4,2,3,2,2,1,3,3,2,3,3,1,2,3,1,1,0,2,4,3,3,2,3,2,1,2,2,1,3,3,2,2,2,2,1,2,3,2,3,1,1,3,2,2,2,2,2,2,4,4,3,3,3,2},
		{4,5,5,4,3,4,4,3,4,3,2,4,5,3,2,3,4,3,4,3,2,3,4,1,2,1,2,0,4,4,3,2,3,3,2,3,2,1,3,3,2,3,2,1,3,2,2,4,1,3,3,2,4,3,3,2,1,2,3,2,1,3,2,2},
		{1,1,1,2,3,2,2,3,2,1,2,2,2,3,4,3,3,4,3,2,3,3,3,3,4,5,4,4,0,1,1,2,1,2,3,2,2,3,1,2,5,4,3,4,4,4,2,2,3,3,3,2,2,3,3,4,3,2,2,3,4,2,3,3},
		{2,2,2,3,4,3,3,4,3,2,3,1,1,2,3,2,2,3,2,1,2,2,2,4,3,4,3,4,1,0,2,3,2,1,2,1,2,3,1,3,4,3,2,3,3,5,3,3,3,4,4,2,3,4,4,5,3,2,3,4,5,3,4,4},
		{2,2,2,2,2,1,2,2,1,1,1,3,3,3,3,2,3,3,2,2,2,3,3,2,4,4,3,3,1,2,0,1,1,1,2,2,1,2,2,2,4,4,3,3,3,3,2,2,2,2,2,2,2,3,3,3,3,2,2,2,3,1,3,2},
		{3,3,3,3,3,2,3,3,2,2,2,4,4,4,4,3,4,4,3,3,3,3,3,1,3,3,2,2,2,3,1,0,1,2,1,2,2,1,3,2,3,3,2,2,2,2,1,2,3,1,1,3,2,2,2,2,2,2,3,3,2,2,2,1},
		{2,2,2,3,3,2,3,3,2,2,2,3,3,4,4,3,4,4,3,3,3,2,2,2,3,4,3,3,1,2,1,1,0,2,2,1,2,2,2,1,4,3,2,3,3,3,1,1,3,2,2,3,1,2,2,3,2,1,3,3,3,2,2,2},
		{3,3,3,3,3,2,3,3,2,2,2,2,2,2,2,1,2,2,1,1,1,2,2,3,3,3,2,3,2,1,1,2,2,0,1,1,1,2,2,3,3,3,2,2,2,4,3,3,2,3,3,2,3,4,4,4,3,2,3,3,4,2,4,3},
		{4,4,4,4,4,3,4,4,3,3,3,3,3,3,3,2,3,3,2,2,2,2,2,2,2,2,1,2,3,2,2,1,2,1,0,1,2,1,3,3,2,2,1,1,1,3,2,3,3,2,2,3,3,3,3,3,2,2,4,4,3,3,3,2},
		{3,3,3,4,4,3,4,4,3,3,3,2,2,3,3,2,3,3,2,2,2,1,1,3,2,3,2,3,2,1,2,2,1,1,1,0,2,2,2,2,3,2,1,2,2,4,2,2,3,3,3,3,2,3,3,4,2,1,4,4,4,3,3,3},
		{2,3,3,3,3,2,3,3,2,2,2,2,3,2,2,1,3,3,2,2,2,2,3,3,3,3,2,2,2,2,1,2,2,1,2,2,0,1,1,2,4,4,3,3,3,4,3,3,1,3,3,1,3,4,4,4,2,1,2,2,3,1,3,2},
		{3,4,4,4,4,3,4,4,3,3,3,3,4,3,3,2,4,4,3,3,3,2,3,2,2,2,1,1,3,3,2,1,2,2,1,2,1,0,2,2,3,3,2,2,2,3,2,3,2,2,2,2,3,3,3,3,1,1,3,3,2,2,2,1},
		{1,2,2,3,4,3,3,4,3,2,3,1,2,2,3,2,3,4,3,2,3,2,3,4,3,4,3,3,1,1,2,3,2,2,3,2,1,2,0,2,5,4,3,4,4,5,3,3,2,4,4,1,3,4,4,5,2,1,2,3,4,2,3,3},
		{1,2,3,3,3,2,4,4,3,3,3,3,4,4,4,3,5,5,4,4,4,2,3,3,3,4,3,3,2,3,2,2,1,3,3,2,2,2,2,0,5,4,3,4,4,4,2,2,3,2,3,3,1,3,2,3,2,1,2,2,2,1,1,1},
		{6,5,4,4,3,4,3,2,3,4,3,4,3,3,2,3,2,1,2,3,2,3,2,2,2,1,2,2,5,4,4,3,4,3,2,3,4,3,5,5,0,1,2,1,1,1,3,3,3,3,2,4,4,2,3,2,3,4,5,4,3,5,4,4},
		{5,4,3,3,3,4,2,2,3,3,3,3,2,2,2,3,1,1,2,2,2,2,1,3,1,2,2,3,4,3,4,3,3,3,2,2,4,3,4,4,1,0,1,2,1,2,2,2,3,3,2,3,3,1,2,3,2,3,4,4,4,5,3,4},
		{4,4,4,3,3,4,3,3,4,2,2,3,3,2,2,3,2,2,3,1,1,2,2,2,1,2,2,2,3,2,3,2,2,2,1,1,3,2,3,3,2,1,0,1,2,3,1,3,2,3,3,2,3,2,2,3,1,2,3,3,3,4,2,3},
		{5,5,5,4,3,4,4,3,4,3,2,4,4,3,2,3,3,2,3,2,1,3,3,1,2,1,2,1,4,3,3,2,3,2,1,2,3,2,4,4,1,2,1,0,2,2,2,4,2,3,3,3,4,3,3,2,2,3,4,3,2,4,3,3},
		{5,4,3,4,4,3,3,3,2,4,4,3,2,3,3,2,2,2,1,3,3,2,1,3,2,2,1,3,4,3,3,2,3,2,1,2,3,2,4,4,1,1,2,2,0,2,3,2,4,2,1,4,3,2,3,3,3,3,5,5,4,4,4,3},
		{5,4,3,3,2,3,2,1,2,3,2,4,4,3,2,3,3,2,3,4,3,3,3,1,2,1,2,2,4,5,3,2,3,4,3,4,4,3,5,4,1,2,3,2,2,0,2,2,3,2,1,4,3,1,2,1,3,4,4,3,2,4,3,3},
		{3,3,3,2,2,3,2,2,3,1,1,4,4,3,3,4,3,3,4,2,2,3,3,1,2,3,3,2,2,3,2,1,1,3,2,2,3,2,3,2,3,2,1,2,3,2,0,2,2,2,2,2,2,1,1,2,1,2,2,2,2,3,1,2},
		{3,2,1,3,3,2,2,2,1,3,3,2,2,3,3,2,3,3,2,4,4,1,1,3,2,3,2,4,2,3,2,2,1,3,3,2,3,3,3,2,3,2,3,4,2,2,2,0,4,2,1,4,1,1,2,3,3,2,4,4,4,3,3,3},
		{3,4,4,3,2,3,3,2,3,2,1,3,4,2,1,2,3,2,3,2,1,3,4,2,2,2,3,1,3,3,2,3,3,2,3,3,1,2,2,3,3,3,2,2,4,3,2,4,0,4,4,1,4,3,3,3,1,2,2,1,2,2,2,3},
		{3,2,3,2,2,1,3,3,2,3,3,3,4,3,3,2,4,4,3,4,4,2,3,2,2,2,1,3,3,4,2,1,2,3,2,3,3,2,4,2,3,3,3,3,2,2,2,2,4,0,1,4,1,2,1,1,3,3,3,3,2,2,2,1},
		{4,3,2,3,3,2,2,2,1,3,3,3,3,3,3,2,3,3,2,4,4,2,2,2,2,2,1,3,3,4,2,1,2,3,2,3,3,2,4,3,2,2,3,3,1,1,2,1,4,1,0,4,2,1,2,2,3,3,4,4,3,3,3,2},
		{2,3,3,2,3,3,2,3,3,1,2,2,3,1,2,2,2,3,3,1,2,3,4,3,2,3,3,2,2,2,2,3,3,2,3,3,1,2,1,3,4,3,2,3,4,4,2,4,1,4,4,0,4,3,3,4,1,2,1,2,3,2,2,3},
		{2,1,2,2,2,1,3,3,2,3,3,2,3,3,3,2,4,4,3,4,4,1,2,3,2,3,2,4,2,3,2,2,1,3,3,2,3,3,3,1,4,3,3,4,3,3,2,1,4,1,2,4,0,2,1,2,3,2,3,3,3,2,2,2},
		{4,3,2,2,2,3,1,1,2,2,2,3,3,2,2,3,2,2,3,3,3,2,2,2,1,2,2,3,3,4,3,2,2,4,3,3,4,3,4,3,2,1,2,3,2,1,1,1,3,2,1,3,2,0,1,2,2,3,3,3,3,4,2,3},
		{3,2,3,1,1,2,2,2,3,2,2,3,4,2,2,3,3,3,4,3,3,2,3,2,1,2,2,3,3,4,3,2,2,4,3,3,4,3,4,2,3,2,2,3,3,2,1,2,3,1,2,3,1,1,0,1,2,3,2,2,2,3,1,2},
		{4,3,4,2,1,2,3,2,3,3,2,4,5,3,2,3,4,3,4,4,3,3,4,1,2,1,2,2,4,5,3,2,3,4,3,4,4,3,5,3,2,3,3,2,3,1,2,3,3,1,2,4,2,2,1,0,3,4,3,2,1,3,2,2},
		{3,4,4,3,3,4,3,3,4,2,2,3,4,2,2,3,3,3,4,2,2,2,3,2,1,2,2,1,3,3,3,2,2,3,2,2,2,1,2,2,3,2,1,2,3,3,1,3,1,3,3,1,3,2,2,3,0,1,2,2,2,3,1,2},
		{2,3,3,4,4,3,4,4,3,3,3,2,3,3,3,2,4,4,3,3,3,1,2,3,2,3,2,2,2,2,2,2,1,2,2,1,1,1,1,1,4,3,2,3,3,4,2,2,2,3,3,2,2,3,3,4,1,0,3,3,3,2,2,2},
		{1,2,3,1,2,2,2,3,3,1,2,3,4,2,3,3,3,4,4,2,3,4,5,3,3,4,4,3,2,3,2,3,3,3,4,4,2,3,2,2,5,4,3,4,5,4,2,4,2,3,4,1,3,3,2,3,2,3,0,1,2,1,1,2},
		{2,3,4,2,1,2,3,2,3,2,1,4,5,3,2,3,4,3,4,3,2,4,5,2,3,3,4,2,3,4,2,3,3,3,4,4,2,3,3,2,4,4,3,3,5,3,2,4,1,3,4,2,3,3,2,2,2,3,1,0,1,1,1,2},
		{3,4,5,3,2,3,4,3,4,3,2,5,6,4,3,4,5,4,5,4,3,4,5,1,3,2,3,1,4,5,3,2,3,4,3,4,3,2,4,2,3,4,3,2,4,2,2,4,2,2,3,3,3,3,2,1,2,3,2,1,0,2,1,1},
		{1,2,3,2,2,1,3,3,2,2,2,3,4,3,3,2,4,4,3,3,3,3,4,3,4,4,3,3,2,3,1,2,2,2,3,3,1,2,2,1,5,5,4,4,4,4,3,3,2,2,3,2,2,4,3,3,3,2,1,1,2,0,2,1},
		{2,3,4,2,2,3,3,3,4,2,2,4,5,3,3,4,4,4,5,3,3,3,4,2,2,3,3,2,3,4,3,2,2,4,3,3,3,2,3,1,4,3,2,3,4,3,1,3,2,2,3,2,2,2,1,2,1,2,1,1,1,2,0,1},
		{2,3,4,3,3,2,4,4,3,3,3,4,5,4,4,3,5,5,4,4,4,3,4,2,3,3,2,2,3,4,2,1,2,3,2,3,2,1,3,1,4,4,3,3,3,3,2,3,3,1,2,3,2,3,2,2,2,2,2,2,1,1,1,0}};
	
	static public Distance Damerau = new Distance() {
		
		@Override
		public int getDistance(char c1, char c2) {
			
			// TODO optimize get index. each char has an int value
			int i1 = getIndex(Character.toLowerCase(c1));
			if(i1 < 0 || i1 >= mDamerauDistance.length) return Integer.MAX_VALUE;
			int i2 = getIndex(Character.toLowerCase(c2));
			if(i2 < 0 || i2 >= mDamerauDistance.length) return Integer.MAX_VALUE;
			// return matrix value
			return mDamerauDistance[i1][i2];
		}
	};
	
	static public Distance DamerauPT = new Distance() {
		
		@Override
		public int getDistance(char c1, char c2) {
			
			// TODO optimize get index. each char has an int value
			int i1 = getIndexPT(Character.toLowerCase(c1));
			if(i1 < 0 || i1 >= mDamerauDistancePT.length) return Integer.MAX_VALUE;
			int i2 = getIndexPT(Character.toLowerCase(c2));
			if(i2 < 0 || i2 >= mDamerauDistancePT.length) return Integer.MAX_VALUE;
			// return matrix value
			return mDamerauDistancePT[i1][i2];
		}
	};
	
	static public Distance DamerauEN = new Distance() {
		
		@Override
		public int getDistance(char c1, char c2) {
			
			// TODO optimize get index. each char has an int value
			int i1 = getIndexEN(Character.toLowerCase(c1));
			if(i1 < 0 || i1 >= mDamerauDistanceEN.length) return Integer.MAX_VALUE;
			int i2 = getIndexEN(Character.toLowerCase(c2));
			if(i2 < 0 || i2 >= mDamerauDistanceEN.length) return Integer.MAX_VALUE;
			// return matrix value
			return mDamerauDistanceEN[i1][i2];
		}
	};
		
	/* UTILS METHODS */
	final static protected int NCHARS = 27; // all letters + space
	private static int getIndex(char c)
	{
		int pos = ((int)c) - 96;
		if (pos >= 1 && pos < NCHARS)
			return pos;
		else
		{
			if(c == ' ') return 0;
			else if(c == '#') return NCHARS;
            else if(c == '1') return NCHARS + 1;
            else if(c == '2') return NCHARS + 2;
            else if(c == '3') return NCHARS + 3;
            else if(c == '4') return NCHARS + 4;
            else if(c == '5') return NCHARS + 5;
            else if(c == '6') return NCHARS + 6;
            else if(c == '7') return NCHARS + 7;
            else if(c == '8') return NCHARS + 8;
            else if(c == '9') return NCHARS + 9;
            else if(c == '0') return NCHARS + 10;
            else if(c == '\'') return NCHARS + 11;
            else if(c == ',') return NCHARS + 12;
            else if(c == '=') return NCHARS + 13;
            else if(c == '&') return NCHARS + 14;
            else if(c == '!') return NCHARS + 15;
            else if(c == ')') return NCHARS + 16;
            else if(c == '(') return NCHARS + 17;
            else if(c == ']') return NCHARS + 18;
            else if(c == '[') return NCHARS + 19;
            else if(c == '<') return NCHARS + 20;
            else if(c == '>') return NCHARS + 21;
            else if(c == ':') return NCHARS + 22;
            else if(c == '\\') return NCHARS + 23;
            else if(c == '/') return NCHARS + 24;
            else if(c == '*') return NCHARS + 25;
            else if(c == '$') return NCHARS + 26;
            else if(c == '%') return NCHARS + 27;
            else if(c == '?') return NCHARS + 28;
            else if(c == '+') return NCHARS + 29;
            else if(c == '-') return NCHARS + 30;
            else if(c == '@') return NCHARS + 31;
            else if(c == '^') return NCHARS + 32;
            else if(c == '_') return NCHARS + 33;
            else if(c == '"') return NCHARS + 34;
            else if(c == '.') return NCHARS + 35;
            else if(c == ';') return NCHARS + 36;
            else return -1;
		}
	}
	
	private static int getIndexPT(char c)
	{
		int pos = ((int)c) - 96;
		if (pos >= 1 && pos < NCHARS)
			return pos;
		else
		{
			if(c == ' ') return 0;
			else if(c == '�') return NCHARS;
            else if(c == ',') return NCHARS + 1;
            else if(c == ';') return NCHARS + 2;
            else if(c == ':') return NCHARS + 3;
            else if(c == '/') return NCHARS + 4;
            else if(c == '?') return NCHARS + 5;
            else if(c == '!') return NCHARS + 6;
            else if(c == '�') return NCHARS + 7;
            else if(c == '\"') return NCHARS + 8;
            else if(c == '*') return NCHARS + 9;
            else if(c == '�') return NCHARS + 10;
            else if(c == '.') return NCHARS + 11;
            else if(c == '\'') return NCHARS + 12;
            else if(c == '�') return NCHARS + 13;
            else if(c == '�') return NCHARS + 14;
            else if(c == '�') return NCHARS + 15;
            else if(c == '�') return NCHARS + 16;
            else if(c == '�') return NCHARS + 17;
            else if(c == '�') return NCHARS + 18;
            else if(c == '�') return NCHARS + 19;
            else if(c == '�') return NCHARS + 20;
            else if(c == '�') return NCHARS + 21;
            else if(c == '@') return NCHARS + 22;
            else if(c == '�') return NCHARS + 23;
            else if(c == '�') return NCHARS + 24;
            else if(c == '�') return NCHARS + 25;
            else if(c == '�') return NCHARS + 26;
            else if(c == '�') return NCHARS + 27;
            else if(c == '�') return NCHARS + 28;
            else if(c == '�') return NCHARS + 29;
            else if(c == '-') return NCHARS + 30;
            else if(c == '�') return NCHARS + 31;
            else if(c == '�') return NCHARS + 32;
            else if(c == '|') return NCHARS + 33;
            else if(c == '�') return NCHARS + 34;
            else if(c == '�') return NCHARS + 35;
            else if(c == '$') return NCHARS + 36;
            else return -1;
		}
	}
	
	private static int getIndexEN(char c)
	{
		int pos = ((int)c) - 96;
		if (pos >= 1 && pos < NCHARS)
			return pos;
		else
		{
			if(c == ' ') return 0;
			else if(c == '�') return NCHARS;
            else if(c == ',') return NCHARS + 1;
            else if(c == ';') return NCHARS + 2;
            else if(c == ':') return NCHARS + 3;
            else if(c == '.') return NCHARS + 4;
            else if(c == '�') return NCHARS + 5;
            else if(c == '!') return NCHARS + 6;
            else if(c == '=') return NCHARS + 7;
            else if(c == '?') return NCHARS + 8;
            else if(c == '�') return NCHARS + 9;
            else if(c == '�') return NCHARS + 10;
            else if(c == '\'') return NCHARS + 11;
            else if(c == '�') return NCHARS + 12;
            else if(c == '�') return NCHARS + 13;
            else if(c == '�') return NCHARS + 14;
            else if(c == '�') return NCHARS + 15;
            else if(c == '�') return NCHARS + 16;
            else if(c == '�') return NCHARS + 17;
            else if(c == '�') return NCHARS + 18;
            else if(c == '^') return NCHARS + 19;
            else if(c == '�') return NCHARS + 20;
            else if(c == '@') return NCHARS + 21;
            else if(c == '"') return NCHARS + 22;
            else if(c == '�') return NCHARS + 23;
            else if(c == '/') return NCHARS + 24;
            else if(c == '�') return NCHARS + 25;
            else if(c == '�') return NCHARS + 26;
            else if(c == '�') return NCHARS + 27;
            else if(c == '�') return NCHARS + 28;
            else if(c == '�') return NCHARS + 29;
            else if(c == '-') return NCHARS + 30;
            else if(c == '�') return NCHARS + 31;
            else if(c == '�') return NCHARS + 32;
            else if(c == '�') return NCHARS + 33;
            else if(c == '�') return NCHARS + 34;
            else if(c == '�') return NCHARS + 35;
            else if(c == '�') return NCHARS + 36;
            else return -1;
		}
	}

}
