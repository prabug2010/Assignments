package com.java.collections.codes;

	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.Map;

	public class HierarchyComparator implements Comparator {

		public static Map<String, Integer> hierarchyMap = new HashMap<>();

		static {
			hierarchyMap.put("Chief Executive Officer", 1);
			hierarchyMap.put("Vice President", 2);
			hierarchyMap.put("Associate Vice President", 3);
			hierarchyMap.put("Senior Manager - Projects", 4);
			hierarchyMap.put("Manager - Projects", 5);
			hierarchyMap.put("Architect", 6);
			hierarchyMap.put("Associate", 7);
		}

		@Override
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;

			if (hierarchyMap.get(s1) == hierarchyMap.get(s2))
				return 0;
			else if (hierarchyMap.get(s1) > hierarchyMap.get(s2))
				return 1;
			else
				return -1;
		}
	}
