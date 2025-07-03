package core_java_day15;

import java.util.*;

public class CollectionMemoryTest {

	public static void main(String[] args) {
		// Warm up the JVM
		System.gc();

		// Measure memory usage for ArrayList
		measureMemoryUsage("ArrayList", () -> {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 100000; i++) {
				list.add(i);
			}
			return list;
		});

		// Measure memory usage for LinkedList
		measureMemoryUsage("LinkedList", () -> {
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < 100000; i++) {
				list.add(i);
			}
			return list;
		});

		// Measure memory usage for HashSet
		measureMemoryUsage("HashSet", () -> {
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < 100000; i++) {
				set.add(i);
			}
			return set;
		});

		// Measure memory usage for HashMap
		measureMemoryUsage("HashMap", () -> {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < 100000; i++) {
				map.put(i, i);
			}
			return map;
		});
	}

	private static void measureMemoryUsage(String collectionName, CollectionCreator creator) {
		System.gc(); // Request garbage collection
		long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		Object collection = creator.create(); // Create the collection

		System.gc(); // Request garbage collection again
		long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		System.out.println(collectionName + " memory usage: " + (afterMemory - beforeMemory) + " bytes");
	}

	// Functional interface for creating collections
	interface CollectionCreator {
		Object create();
	}
	
	

//    private static final int SIZE = 100000;
//
//    public static void main(String[] args) {
//        System.out.println("Measuring memory usage (approx)...\n");
//
//        measureArrayList();
//        measureLinkedList();
//        measureHashSet();
//        measureHashMap();
//    }
//
//    private static void measureArrayList() {
//        runGC();
//        long before = getUsedMemory();
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < SIZE; i++) {
//            list.add(i);
//        }
//        runGC();
//        long after = getUsedMemory();
//        System.out.println("ArrayList used: " + (after - before) / 1024 + " KB");
//    }
//
//    private static void measureLinkedList() {
//        runGC();
//        long before = getUsedMemory();
//        List<Integer> list = new LinkedList<Integer>();
//        for (int i = 0; i < SIZE; i++) {
//            list.add(i);
//        }
//        runGC();
//        long after = getUsedMemory();
//        System.out.println("LinkedList used: " + (after - before) / 1024 + " KB");
//    }
//
//    private static void measureHashSet() {
//        runGC();
//        long before = getUsedMemory();
//        Set<Integer> set = new HashSet<Integer>();
//        for (int i = 0; i < SIZE; i++) {
//            set.add(i);
//        }
//        runGC();
//        long after = getUsedMemory();
//        System.out.println("HashSet used: " + (after - before) / 1024 + " KB");
//    }
//
//    private static void measureHashMap() {
//        runGC();
//        long before = getUsedMemory();
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        for (int i = 0; i < SIZE; i++) {
//            map.put(i, "Val" + i);
//        }
//        runGC();
//        long after = getUsedMemory();
//        System.out.println("HashMap used: " + (after - before) / 1024 + " KB");
//    }
//
//    private static long getUsedMemory() {
//        Runtime rt = Runtime.getRuntime();
//        return rt.totalMemory() - rt.freeMemory();
//    }
//
//    private static void runGC() {
//        try {
//            System.gc();
//            Thread.sleep(100);
//            System.runFinalization();
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
