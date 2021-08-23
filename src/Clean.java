class clean
{
    static class findingNumbers
    {

        int SmallestNumber;
        int LargestNumber;
    }

    static findingNumbers MAX_MIN_number(int Array[], int SizeOfArray)
    {
        findingNumbers obj= new findingNumbers();

        int i;

        if (SizeOfArray == 1)
        {
            obj.LargestNumber = Array[0];
            obj.SmallestNumber = Array[0];
            return obj;
        }

        if (Array[0] > Array[1])
        {
            obj.LargestNumber = Array[0];
            obj.SmallestNumber = Array[1];
        }
        else
        {
            obj.LargestNumber = Array[1];
            obj.SmallestNumber = Array[0];
        }

        for (i = 2; i < SizeOfArray; i++)
        {
            if (Array[i] > obj.LargestNumber)
            {
                obj.LargestNumber = Array[i];
            }
            else if (Array[i] < obj.SmallestNumber)
            {
                obj.SmallestNumber = Array[i];
            }
        }

        return obj;
    }

    public static void main(String []args)
    {
        int Array[] = {1000, 11, 445, 1, 330, 3000};
        int LengthOfArray = 6;
        findingNumbers objectOfCheck = MAX_MIN_number(Array, LengthOfArray);
        System.out.printf("\n Smallest Number : %d", objectOfCheck.SmallestNumber);
        System.out.printf("\n Largest Number : %d", objectOfCheck.LargestNumber);
    }
}