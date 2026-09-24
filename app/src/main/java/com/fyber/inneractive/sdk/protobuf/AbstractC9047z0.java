package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.z0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9047z0 extends AbstractC8910b {
    private static Map<Object, AbstractC9047z0> defaultInstanceMap = new ConcurrentHashMap();
    protected C8986n3 unknownFields = C8986n3.f21077f;
    protected int memoizedSerializedSize = -1;

    /* JADX INFO: renamed from: a */
    public static AbstractC9047z0 m21848a(AbstractC9047z0 abstractC9047z0) throws C8984n1 {
        if (abstractC9047z0 == null || abstractC9047z0.isInitialized()) {
            return abstractC9047z0;
        }
        C8980m3 c8980m3NewUninitializedMessageException = abstractC9047z0.newUninitializedMessageException();
        c8980m3NewUninitializedMessageException.getClass();
        throw new C8984n1(c8980m3NewUninitializedMessageException.getMessage());
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC9047z0 m21849a(AbstractC9047z0 abstractC9047z0, InputStream inputStream, C8947h0 c8947h0) throws C8984n1 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            if ((i & 128) != 0) {
                i &= 127;
                int i2 = 7;
                while (i2 < 32) {
                    int i3 = inputStream.read();
                    if (i3 == -1) {
                        throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    i |= (i3 & 127) << i2;
                    if ((i3 & 128) != 0) {
                        i2 += 7;
                    }
                }
                while (i2 < 64) {
                    int i4 = inputStream.read();
                    if (i4 == -1) {
                        throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    if ((i4 & 128) != 0) {
                        i2 += 7;
                    }
                }
                throw new C8984n1("CodedInputStream encountered a malformed varint.");
            }
            C9021u c9021u = new C9021u(new C8904a(inputStream, i));
            AbstractC9047z0 partialFrom = parsePartialFrom(abstractC9047z0, c9021u, c8947h0);
            c9021u.mo21716a(0);
            return partialFrom;
        } catch (IOException e) {
            throw new C8984n1(e.getMessage());
        }
    }

    public static C9037x0 access$000(AbstractC8929e0 abstractC8929e0) {
        abstractC8929e0.getClass();
        return (C9037x0) abstractC8929e0;
    }

    public static InterfaceC8912b1 emptyBooleanList() {
        return C8958j.f21051d;
    }

    public static InterfaceC8918c1 emptyDoubleList() {
        return C8923d0.f20997d;
    }

    public static InterfaceC8936f1 emptyFloatList() {
        return C9001q0.f21092d;
    }

    public static InterfaceC8942g1 emptyIntList() {
        return C8906a1.f20976d;
    }

    public static InterfaceC8960j1 emptyLongList() {
        return C9023u1.f21130d;
    }

    public static <E> InterfaceC8966k1 emptyProtobufList() {
        return C9003q2.f21095d;
    }

    public static <T extends AbstractC9047z0> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        try {
            T t2 = (T) ((AbstractC9047z0) AbstractC9040x3.f21170a.allocateInstance(cls)).getDefaultInstanceForType();
            if (t2 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, t2);
            return t2;
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends AbstractC9047z0> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(EnumC9042y0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C8997p2 c8997p2 = C8997p2.f21087c;
        c8997p2.getClass();
        boolean zMo21641a = c8997p2.m21698a(t.getClass()).mo21641a(t);
        if (z) {
            t.dynamicMethod(EnumC9042y0.SET_MEMOIZED_IS_INITIALIZED, zMo21641a ? t : null);
        }
        return zMo21641a;
    }

    public static InterfaceC8912b1 mutableCopy(InterfaceC8912b1 interfaceC8912b1) {
        C8958j c8958j = (C8958j) interfaceC8912b1;
        int i = c8958j.f21053c;
        return c8958j.mo21502b(i == 0 ? 10 : i * 2);
    }

    public static InterfaceC8918c1 mutableCopy(InterfaceC8918c1 interfaceC8918c1) {
        C8923d0 c8923d0 = (C8923d0) interfaceC8918c1;
        int i = c8923d0.f20999c;
        return c8923d0.mo21502b(i == 0 ? 10 : i * 2);
    }

    public static InterfaceC8936f1 mutableCopy(InterfaceC8936f1 interfaceC8936f1) {
        C9001q0 c9001q0 = (C9001q0) interfaceC8936f1;
        int i = c9001q0.f21094c;
        return c9001q0.mo21502b(i == 0 ? 10 : i * 2);
    }

    public static InterfaceC8942g1 mutableCopy(InterfaceC8942g1 interfaceC8942g1) {
        C8906a1 c8906a1 = (C8906a1) interfaceC8942g1;
        int i = c8906a1.f20978c;
        return c8906a1.mo21502b(i == 0 ? 10 : i * 2);
    }

    public static InterfaceC8960j1 mutableCopy(InterfaceC8960j1 interfaceC8960j1) {
        C9023u1 c9023u1 = (C9023u1) interfaceC8960j1;
        int i = c9023u1.f21132c;
        return c9023u1.mo21502b(i == 0 ? 10 : i * 2);
    }

    public static <E> InterfaceC8966k1 mutableCopy(InterfaceC8966k1 interfaceC8966k1) {
        int size = interfaceC8966k1.size();
        return interfaceC8966k1.mo21502b(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(InterfaceC8925d2 interfaceC8925d2, String str, Object[] objArr) {
        return new C9009r2(interfaceC8925d2, str, objArr);
    }

    public static <ContainingType extends InterfaceC8925d2, Type> C9037x0 newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC8925d2 interfaceC8925d2, InterfaceC8930e1 interfaceC8930e1, int i, EnumC8963j4 enumC8963j4, boolean z, Class cls) {
        return new C9037x0(containingtype, Collections.EMPTY_LIST, interfaceC8925d2, new C9032w0(interfaceC8930e1, i, enumC8963j4, true, z));
    }

    public static <ContainingType extends InterfaceC8925d2, Type> C9037x0 newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC8925d2 interfaceC8925d2, InterfaceC8930e1 interfaceC8930e1, int i, EnumC8963j4 enumC8963j4, Class cls) {
        return new C9037x0(containingtype, type, interfaceC8925d2, new C9032w0(interfaceC8930e1, i, enumC8963j4, false, false));
    }

    public static <T extends AbstractC9047z0> T parseDelimitedFrom(T t, InputStream inputStream) throws C8984n1 {
        return (T) m21848a(m21849a(t, inputStream, C8947h0.m21617a()));
    }

    public static <T extends AbstractC9047z0> T parseDelimitedFrom(T t, InputStream inputStream, C8947h0 c8947h0) throws C8984n1 {
        return (T) m21848a(m21849a(t, inputStream, c8947h0));
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, AbstractC9011s abstractC9011s) throws C8984n1 {
        return (T) m21848a(parseFrom(t, abstractC9011s, C8947h0.m21617a()));
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, AbstractC9011s abstractC9011s, C8947h0 c8947h0) throws C8984n1 {
        AbstractC9031w abstractC9031wMo21703d = abstractC9011s.mo21703d();
        AbstractC9047z0 partialFrom = parsePartialFrom(t, abstractC9031wMo21703d, c8947h0);
        abstractC9031wMo21703d.mo21716a(0);
        return (T) m21848a(partialFrom);
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, AbstractC9031w abstractC9031w) throws C8984n1 {
        return (T) parseFrom(t, abstractC9031w, C8947h0.m21617a());
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws C8984n1 {
        return (T) m21848a(parsePartialFrom(t, abstractC9031w, c8947h0));
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, InputStream inputStream) throws C8984n1 {
        AbstractC9031w c9021u;
        if (inputStream == null) {
            byte[] bArr = AbstractC8972l1.f21065b;
            int length = bArr.length;
            c9021u = new C9016t(bArr, 0, length, false);
            try {
                c9021u.mo21722d(length);
            } catch (C8984n1 e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            c9021u = new C9021u(inputStream);
        }
        return (T) m21848a(parsePartialFrom(t, c9021u, C8947h0.m21617a()));
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, InputStream inputStream, C8947h0 c8947h0) throws C8984n1 {
        AbstractC9031w c9021u;
        if (inputStream == null) {
            byte[] bArr = AbstractC8972l1.f21065b;
            int length = bArr.length;
            c9021u = new C9016t(bArr, 0, length, false);
            try {
                c9021u.mo21722d(length);
            } catch (C8984n1 e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            c9021u = new C9021u(inputStream);
        }
        return (T) m21848a(parsePartialFrom(t, c9021u, c8947h0));
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, ByteBuffer byteBuffer) throws C8984n1 {
        return (T) parseFrom(t, byteBuffer, C8947h0.m21617a());
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, ByteBuffer byteBuffer, C8947h0 c8947h0) throws C8984n1 {
        C9016t c9016t;
        AbstractC9031w c9026v;
        if (!byteBuffer.hasArray()) {
            if (byteBuffer.isDirect() && AbstractC9040x3.f21173d) {
                c9026v = new C9026v(byteBuffer, false);
            } else {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.duplicate().get(bArr);
                C9016t c9016t2 = new C9016t(bArr, 0, iRemaining, true);
                try {
                    c9016t2.mo21722d(iRemaining);
                    c9016t = c9016t2;
                } catch (C8984n1 e) {
                    throw new IllegalArgumentException(e);
                }
            }
            return (T) m21848a(parseFrom(t, c9026v, c8947h0));
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining2 = byteBuffer.remaining();
        c9016t = new C9016t(bArrArray, iPosition, iRemaining2, false);
        try {
            c9016t.mo21722d(iRemaining2);
        } catch (C8984n1 e2) {
            throw new IllegalArgumentException(e2);
        }
        c9026v = c9016t;
        return (T) m21848a(parseFrom(t, c9026v, c8947h0));
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, byte[] bArr) throws C8984n1 {
        return (T) m21848a(parsePartialFrom(t, bArr, 0, bArr.length, C8947h0.m21617a()));
    }

    public static <T extends AbstractC9047z0> T parseFrom(T t, byte[] bArr, C8947h0 c8947h0) throws C8984n1 {
        return (T) m21848a(parsePartialFrom(t, bArr, 0, bArr.length, c8947h0));
    }

    public static <T extends AbstractC9047z0> T parsePartialFrom(T t, AbstractC9031w abstractC9031w) throws C8984n1 {
        return (T) parsePartialFrom(t, abstractC9031w, C8947h0.m21617a());
    }

    public static <T extends AbstractC9047z0> T parsePartialFrom(T t, AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws C8984n1 {
        T t2 = (T) t.dynamicMethod(EnumC9042y0.NEW_MUTABLE_INSTANCE);
        try {
            C8997p2 c8997p2 = C8997p2.f21087c;
            c8997p2.getClass();
            InterfaceC9019t2 interfaceC9019t2M21698a = c8997p2.m21698a(t2.getClass());
            C9036x c9036x = abstractC9031w.f21148d;
            if (c9036x == null) {
                c9036x = new C9036x(abstractC9031w);
            }
            interfaceC9019t2M21698a.mo21636a(t2, c9036x, c8947h0);
            interfaceC9019t2M21698a.mo21652c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C8984n1) {
                throw ((C8984n1) e.getCause());
            }
            throw new C8984n1(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C8984n1) {
                throw ((C8984n1) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends AbstractC9047z0> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C8947h0 c8947h0) throws C8984n1 {
        T t2 = (T) t.dynamicMethod(EnumC9042y0.NEW_MUTABLE_INSTANCE);
        try {
            C8997p2 c8997p2 = C8997p2.f21087c;
            c8997p2.getClass();
            InterfaceC9019t2 interfaceC9019t2M21698a = c8997p2.m21698a(t2.getClass());
            interfaceC9019t2M21698a.mo21638a(t2, bArr, i, i + i2, new C8934f(c8947h0));
            interfaceC9019t2M21698a.mo21652c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C8984n1) {
                throw ((C8984n1) e.getCause());
            }
            throw new C8984n1(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <T extends AbstractC9047z0> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(EnumC9042y0.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends AbstractC9047z0, BuilderType extends AbstractC9017t0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(EnumC9042y0.NEW_BUILDER);
    }

    public final <MessageType extends AbstractC9047z0, BuilderType extends AbstractC9017t0> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.m21753c();
        AbstractC9017t0.m21748a(buildertype.f21118b, messagetype);
        return buildertype;
    }

    public Object dynamicMethod(EnumC9042y0 enumC9042y0) {
        return dynamicMethod(enumC9042y0, null, null);
    }

    public Object dynamicMethod(EnumC9042y0 enumC9042y0, Object obj) {
        return dynamicMethod(enumC9042y0, obj, null);
    }

    public abstract Object dynamicMethod(EnumC9042y0 enumC9042y0, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8997p2 c8997p2 = C8997p2.f21087c;
        c8997p2.getClass();
        return c8997p2.m21698a(getClass()).mo21649b(this, (AbstractC9047z0) obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8931e2
    public final AbstractC9047z0 getDefaultInstanceForType() {
        return (AbstractC9047z0) dynamicMethod(EnumC9042y0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8910b
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final InterfaceC8979m2 getParserForType() {
        return (InterfaceC8979m2) dynamicMethod(EnumC9042y0.GET_PARSER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8925d2
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            C8997p2 c8997p2 = C8997p2.f21087c;
            c8997p2.getClass();
            this.memoizedSerializedSize = c8997p2.m21698a(getClass()).mo21643b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C8997p2 c8997p2 = C8997p2.f21087c;
        c8997p2.getClass();
        int iMo21653d = c8997p2.m21698a(getClass()).mo21653d(this);
        this.memoizedHashCode = iMo21653d;
        return iMo21653d;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8931e2
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        C8997p2 c8997p2 = C8997p2.f21087c;
        c8997p2.getClass();
        c8997p2.m21698a(getClass()).mo21652c(this);
    }

    public void mergeLengthDelimitedField(int i, AbstractC9011s abstractC9011s) {
        if (this.unknownFields == C8986n3.f21077f) {
            this.unknownFields = new C8986n3();
        }
        C8986n3 c8986n3 = this.unknownFields;
        if (!c8986n3.f21082e) {
            throw new UnsupportedOperationException();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c8986n3.m21688a((i << 3) | 2, abstractC9011s);
    }

    public final void mergeUnknownFields(C8986n3 c8986n3) {
        this.unknownFields = C8986n3.m21686a(this.unknownFields, c8986n3);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == C8986n3.f21077f) {
            this.unknownFields = new C8986n3();
        }
        C8986n3 c8986n3 = this.unknownFields;
        if (!c8986n3.f21082e) {
            throw new UnsupportedOperationException();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c8986n3.m21688a(i << 3, Long.valueOf(i2));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8925d2
    public final AbstractC9017t0 newBuilderForType() {
        return (AbstractC9017t0) dynamicMethod(EnumC9042y0.NEW_BUILDER);
    }

    public boolean parseUnknownField(int i, AbstractC9031w abstractC9031w) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == C8986n3.f21077f) {
            this.unknownFields = new C8986n3();
        }
        return this.unknownFields.m21690a(i, abstractC9031w);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8910b
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8925d2
    public final AbstractC9017t0 toBuilder() {
        AbstractC9017t0 abstractC9017t0 = (AbstractC9017t0) dynamicMethod(EnumC9042y0.NEW_BUILDER);
        abstractC9017t0.m21753c();
        AbstractC9017t0.m21748a(abstractC9017t0.f21118b, this);
        return abstractC9017t0;
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC8937f2.m21540a(this, sb, 0);
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8925d2
    public void writeTo(AbstractC8911b0 abstractC8911b0) throws IOException {
        C8997p2 c8997p2 = C8997p2.f21087c;
        c8997p2.getClass();
        InterfaceC9019t2 interfaceC9019t2M21698a = c8997p2.m21698a(getClass());
        C8917c0 c8917c0 = abstractC8911b0.f20985a;
        if (c8917c0 == null) {
            c8917c0 = new C8917c0(abstractC8911b0);
        }
        interfaceC9019t2M21698a.mo21635a((Object) this, c8917c0);
    }
}
