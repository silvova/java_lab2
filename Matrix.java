public class Matrix {

	private int size;
	private int[][] arr;

	Matrix(int size) {
		this.size = size;
		arr = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) { arr[i][j] = 1; }
				else { arr[i][j] = 0; }
			}
		}
	}

	public Matrix(Matrix B) {
        this.size = B.size;
        this.arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.arr[i][j] = B.arr[i][j];
            }
        }  
    }

	public void setElement (int row, int column, int value) {
		arr[row][column] = value;
	}

	public int getElement (int row, int column) {
		return arr[row][column];
	}

	public void sum (Matrix B) {
		if (this.size != B.size) {
			System.out.println("Error! Wrong matrixes size.");
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				this.arr[i][j] += B.arr[i][j];
			}
		}
	}

	public Matrix product(Matrix B) {
        if (this.size != B.size) {
			System.out.println("Error! Wrong matrixes size.");
			return this;
		}
        Matrix result = new Matrix(this.size);
        for(int i = 0; i < size; i++){
        	for(int j = 0; j < size; j++){
        		result.arr[i][j] = 0;
        		for(int k = 0; k < size; k++){
        			result.arr[i][j] += this.arr[i][k] * B.arr[k][j];
                }
            }
        }
        return result;
    }

    public void doSortColumns() {
    	int[] sum = new int[size];
    	int[] column = new int[size];
    	for(int i = 0; i < size; i++) {
    		for(int j = 0; j < size; j++) {
    			sum[i] += arr[j][i];
    		}
    	}
    	for(int i = 1; i < size; ++i) {
    		int x = sum[i];
    		for(int k = 0; k < size; k++) {
    			column[k] = arr[k][i];
    		}
    		int j = i;
    		while (j > 0 && sum[j - 1] > x) {
    			for(int k = 0; k < size; k++) {
    				arr[k][j] = arr[k][j-1];
    			}
    			j--;
    		}
    		for(int k = 0; k < size; k++) {
    			arr[k][j] = column[k];
    		}
    	}
    }

	public String toString () {
		StringBuilder mtx = new StringBuilder();
		for (int i = 0; i < size; i++) {
			mtx.append("[");
			for (int j = 0; j < size; j++) {
				mtx.append(arr[i][j]);
				if (j != size -1) { mtx.append(" "); }
			}
			mtx.append("]");
			if (i != size-1) { mtx.append("\n"); }
		}
		return mtx.toString();
	}

}