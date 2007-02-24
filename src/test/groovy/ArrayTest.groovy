package groovy

class ArrayTest extends GroovyTestCase {

    void testFixedSize() {
        def array = new String[10]
        assert array.size() == 10
        array[0] = "Hello"
        assert array[0] == "Hello"
    }
    
    void testArrayWithInitializer() {
        String[] array = [ "nice", "cheese", "gromit" ]
        assert array.size() == 3
        assert array[0] == "nice" , array.inspect()
        assert array[1] == "cheese"
        assert array[2] == "gromit"
    }

    void testCharArrayCreate() {
           def array = new char[3]
           assert array.size() == 3
    }

    void testCharArrayWithInitializer() {
        char[] array = [ 'a', 'b', 'c' ]
        assert array.size() == 3
        assert array[0] == 'a' , array.inspect()
        assert array[1] == 'b'
        assert array[2] == 'c'
    }
    
    void testByteArrayCreate() {
        def array = new byte[100]
        assert array.size() == 100;
    }

    void testByteArrayWithInitializer() {
        byte[] array = [0, 1, 2, 3]
        assert array.size() == 4
        assert array[0] == 0 , array.inspect()
        assert array[1] == 1
        assert array[2] == 2
        assert array[3] == 3
    }

    void testByteArrayWithInitializerAndAssignmentOfNumber() {
        byte[] array = [ 2, 4]
        assert array.size() == 2
        assert array[0] == 2
        assert array[1] == 4

        array[0] = 76
        array[1] = 32
        assert array[0] == 76
        assert array[1] == 32

        array.putAt(0, 45)
        array.putAt(1, 67)
        assert array[0] == 45
        assert array[1] == 67
    }

    void testDoubleArrayCreate() {
         def array  = new double[3]
         assert array.size() == 3
    }

    void testDoubleArrayWithInitializer() {
        double[] array = [ 1.3, 3.14, 2.7]
        assert array.size() == 3
        assert array[0] == 1.3 , array.inspect()
        assert array[1] == 3.14
        assert array[2] == 2.7
    }

    void testIntArrayCreate() {
        def array = new int[5]
        assert array.size() == 5
    }

    void testIntArrayWithInitializer() {
        int[] array = [42, -5, 360]
        assert array.size() == 3
        assert array[0] == 42 , array.inspect()
        assert array[1] == -5
        assert array[2] == 360
    }

    void testArrayDeclaration() {
        String[] array = [ "a", "b", "c" ]
        assert array.size() == 3
        assert array[0] == "a"
        assert array[1] == "b"
        assert array[2] == "c"
    }

    void testSimpleArrayEquals() {
        Integer[] arr1 = [1,2,3,4]
        Integer[] arr2 = [1,2,3,4]
        assert arr1 == arr2
        int[] primarr1 = [1,2,3,4]
        int[] primarr2 = [1,2,3,4]
        assert primarr1 == primarr2
        assert primarr1 == arr2
        double[] primarr3 = [1,2,3,4]
        long[] primarr4 = [1,2,3,4]
        assert primarr3 == primarr4
        assert primarr3 == primarr1
        assert primarr2 == primarr4
        def list1 = [1,2,3,4]
        assert list1 == arr1
        assert arr1 == list1
        assert list1 == primarr1
        assert primarr1 == list1
    }

    void testComplexArrayEquals() {
        def a = [1,2] as Integer[]
        def b = [1,2]
        assert a == b
        assert [[1,2],[3,4]] == [[1,2],[3,4]]
        def x = [[1,2] as Integer[]]
        Object[] y = [[1,2]]
        assert y == x
        //TODO: make this work; currently throws ClassCastException
        //assert [[1,2],[3,4]] as int[][] == [[1,2],[3,4]] as int[][]
    }

}
