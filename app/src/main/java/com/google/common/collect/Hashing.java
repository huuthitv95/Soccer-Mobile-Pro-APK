package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes6.dex */
@ElementTypesAreNonnullByDefault
final class Hashing {

    /* JADX INFO: renamed from: C1 */
    private static final long f22527C1 = -862048943;

    /* JADX INFO: renamed from: C2 */
    private static final long f22528C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    static boolean needsResizing(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    private Hashing() {
    }

    static int smear(int hashCode) {
        return (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * f22527C1), 15)) * f22528C2);
    }

    static int smearedHash(@CheckForNull Object o) {
        return smear(o == null ? 0 : o.hashCode());
    }

    static int closedTableSize(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (loadFactor * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i = iHighestOneBit << 1;
        if (i > 0) {
            return i;
        }
        return 1073741824;
    }
}
