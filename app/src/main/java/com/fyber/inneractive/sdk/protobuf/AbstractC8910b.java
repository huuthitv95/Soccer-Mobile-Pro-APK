package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8910b implements InterfaceC8925d2 {
    protected int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC9017t0.m21749a(iterable, (List) collection);
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC9017t0.m21749a(iterable, list);
    }

    public static void checkByteStringIsUtf8(AbstractC9011s abstractC9011s) throws IllegalArgumentException {
        if (!abstractC9011s.mo21702c()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public abstract int getMemoizedSerializedSize();

    public int getSerializedSize(InterfaceC9019t2 interfaceC9019t2) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo21643b = interfaceC9019t2.mo21643b(this);
        setMemoizedSerializedSize(iMo21643b);
        return iMo21643b;
    }

    public C8980m3 newUninitializedMessageException() {
        return new C8980m3();
    }

    public abstract void setMemoizedSerializedSize(int i);

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC8911b0.f20983b;
            C9041y c9041y = new C9041y(serializedSize, bArr);
            writeTo(c9041y);
            if (c9041y.m21840a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public AbstractC9011s toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C9000q c9000q = AbstractC9011s.f21106b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC8911b0.f20983b;
            C9041y c9041y = new C9041y(serializedSize, bArr);
            writeTo(c9041y);
            if (c9041y.m21840a() == 0) {
                return new C9000q(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iM21516c = AbstractC8911b0.m21516c(serializedSize) + serializedSize;
        if (iM21516c > 4096) {
            iM21516c = 4096;
        }
        C8905a0 c8905a0 = new C8905a0(outputStream, iM21516c);
        c8905a0.m21501j(5);
        c8905a0.m21500i(serializedSize);
        writeTo(c8905a0);
        if (c8905a0.f20974f > 0) {
            c8905a0.m21472a();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = AbstractC8911b0.f20983b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C8905a0 c8905a0 = new C8905a0(outputStream, serializedSize);
        writeTo(c8905a0);
        if (c8905a0.f20974f > 0) {
            c8905a0.m21472a();
        }
    }
}
