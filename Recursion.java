package recursion;

public class Recursion {

	public static void main(String[] args) {
//		System.out.println(Recursion.countZeroesInNumber(1200102));
		Recursion.printHalfPyramid(5);
	}

	public static int sumOfDigit(int digit) {
		if (digit == 0)
			return 0;
		int remainder = digit % 10;
//		System.out.println("digit :: "+digit+"  remainder :: "+remainder);
		return remainder + sumOfDigit(digit / 10);
	}

	public static int countZeroesInNumber(int number) {
		if (number == 0)
			return 0;
		int isZero = number % 10 == 0 ? 1 : 0;
//		System.out.println("number :: "+number+"  isZero :: "+isZero);
		return isZero + countZeroesInNumber(number / 10);
	}

	public static String turnAroundString(String str) {
		if (str.length() == 1)
			return str;
		char endChar = str.charAt(str.length() - 1);
		return endChar + Recursion.turnAroundString(str.substring(0, str.length() - 1));
	}

	public static void printStars(int noOfStar) {
		if (noOfStar == 0)
			return;
		System.out.print("*");
		printStars(noOfStar - 1);
	}

	public static void printDigits(int size, int digit) {
		if (size == 0)
			return;
		System.out.print(digit);
		printDigits(--size, digit);
	}

	public static void printDigitInSequence(int size, int digitToPrint) {
		if (size == 0)
			return;
		System.out.print(digitToPrint);
		printDigitInSequence(size - 1, digitToPrint + 1);
	}

	public static int printDigitInSequentiallyAndGetLastPrintedDigit(int size, int digitToPrint) {
		if (size == 0 || size < 0)
			return digitToPrint;
		System.out.print(digitToPrint);
		return printDigitInSequentiallyAndGetLastPrintedDigit(size - 1, digitToPrint + 1);
	}

//	upsideDownhalfPyramidPattern
	public static void halfPyramidPattern(int sizeOfPyramid, int topSize) {
		if (sizeOfPyramid == 0)
			return;
		printStars(topSize);
		System.out.println("");
		halfPyramidPattern(sizeOfPyramid - 1, topSize + 1);
//		printStars(topSize);
//		System.out.println("");
	}

	public static void upsideDownhalfPyramidPattern(int sizeOfPyramid) {
		if (sizeOfPyramid == 0)
			return;
		printStars(sizeOfPyramid);
		System.out.println("");
		upsideDownhalfPyramidPattern(--sizeOfPyramid);
	}

	public static void numericHalfPyramid(int sizeOfPyramid, int topDigitAndSize) {
		if (sizeOfPyramid == 0)
			return;
		printDigits(topDigitAndSize, topDigitAndSize);
		System.out.println("");
		numericHalfPyramid(sizeOfPyramid - 1, topDigitAndSize + 1);
//		printDigits(topDigitAndSize, topDigitAndSize);
//		System.out.println("");
	}

	public static void numericSequenceHalfPyramid(int sizeOfPyramid, int startDigit, int rowSize) {
		if (sizeOfPyramid == 0)
			return;
		int lastDigitPrinted = printDigitInSequentiallyAndGetLastPrintedDigit(rowSize, startDigit);
		System.out.println("");
		numericSequenceHalfPyramid(sizeOfPyramid - 1, lastDigitPrinted, rowSize + 1);
//		printDigitInSequence(topDigitAndSize, topDigitAndSize);
//		System.out.println("");
	}

	public static void halfDaimond(int sizeOfPyramid, int topSize) {
		if (sizeOfPyramid == 0)
			return;
		printStars(topSize);
		System.out.println("");
		halfDaimond(sizeOfPyramid - 1, topSize + 1);
		printStars(topSize - 1);
		System.out.println("");
	}

	public static void printSpace(int noOfSpace) {
		if (noOfSpace == 0)
			return;
		System.out.print(" ");
		printSpace(noOfSpace - 1);
	}

	public static void halfPyramidMirrorImage(int size, int noOfSpace) {
//		System.out.println("size and noOfSpace :: "+ size + " " + noOfSpace);
		if (size == 0)
			return;
		Recursion.printSpace(noOfSpace);
		Recursion.printStars(size);
		System.out.println("");
		halfPyramidMirrorImage(size - 1, noOfSpace + 1);
		if (size == 1)
			return;
		Recursion.printSpace(noOfSpace);
		Recursion.printStars(size);
		System.out.println("");
	}

	public static int printAlphabetInSequentiallyAndGetLastPrintedAlphaAscii(int size, int digitToPrint) {
		if (size == 0 || size < 0)
			return digitToPrint;
		System.out.print((char) (digitToPrint + 64));
		return printAlphabetInSequentiallyAndGetLastPrintedAlphaAscii(size - 1, digitToPrint + 1);
	}

	public static void printAlphabetInSequence(int size, int digitToPrint) {
		if (size == 0)
			return;
		System.out.print((char) (digitToPrint + 64));
		printAlphabetInSequence(size - 1, digitToPrint + 1);
	}

	public static void AlphabetsHalfPyramidPattern(int sizeOfPyramid, int topSize) {
		if (sizeOfPyramid == 0)
			return;
		printAlphabetInSequence(topSize, 1);
		System.out.println("");
		AlphabetsHalfPyramidPattern(sizeOfPyramid - 1, topSize + 1);
//		printStars(topSize);
//		System.out.println("");
	}

	public static void alphabatecialSequenceHalfPyramid(int sizeOfPyramid, int startDigit, int rowSize) {
		if (sizeOfPyramid == 0)
			return;
		int lastDigitPrinted = printAlphabetInSequentiallyAndGetLastPrintedAlphaAscii(rowSize, startDigit);
		System.out.println("");
		alphabatecialSequenceHalfPyramid(sizeOfPyramid - 1, lastDigitPrinted, rowSize + 1);
//		printDigitInSequence(topDigitAndSize, topDigitAndSize);
//		System.out.println("");
	}
	
	public static void printPyramid(int numOfRows) {
		Recursion.printPyramid(numOfRows,1);
	}
	
	public static void printPyramid(int numOfSpace, int numOfStar) {
		if(numOfSpace==0) {
			System.out.println("");
			Recursion.printStars(numOfStar);
			return;
		}
		System.out.println("");
		Recursion.printSpace(numOfSpace);
		Recursion.printStars(numOfStar);
		printPyramid(numOfSpace-1, numOfStar+2);
	}
	
	
	public static void printHalfPyramid(int numOfRows) {
		Recursion.printHalfPyramid(numOfRows,1);
	}
	
	public static void printHalfPyramid(int numOfSpace, int numOfStar) {
		if(numOfSpace==0) {
			System.out.println("");
			Recursion.printStars(numOfStar);
			return;
		}
		System.out.println("");
		Recursion.printSpace(numOfSpace);
		Recursion.printStars(numOfStar);
		printHalfPyramid(numOfSpace-1, numOfStar+1);
	}

}
