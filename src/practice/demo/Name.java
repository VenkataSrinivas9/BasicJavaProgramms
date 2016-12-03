package practice.demo;

import java.util.*;

// The Name class overrides the equals method, and the hashCode contract demands
// that equal objects have equal hash codes. To fulfill this contract, you must
// over-ride hashCode whenever you override equals

// When the program puts the first Name instance into the hash set, the set puts
// an entry for this instance into a hash bucket. The set chooses the hash bucket
// based on the hash value of the instance, as computed by its hashCode method. When
// it checks whether the second Name instance is contained in the hash set, the
// program chooses which bucket to search based on the hash value of the second
// instance. Because the second instance is distinct from the first, it is likely to have
// a different hash value. If the two hash values map to different buckets, the contains
// method will return false :

// Implement a new hashCode method
public class Name {

    private final String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Name)) {
            return false;
        }

        Name n = (Name) o;
        return n.first.equals(first) && n.last.equals(last);
    }

    public static void main(String[] args) {
        Set<Name> s = new HashSet<Name>();
        s.add(new Name("Mickey", "Mouse"));
        System.out.println(s.contains(new Name("Mickey", "Mouse")));
    }

//    public int hashCode() {
//        return 37 * first.hashCode() + last.hashCode();
//    }

}