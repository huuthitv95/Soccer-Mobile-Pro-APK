package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class StringValue extends AbstractC9047z0 implements InterfaceC8931e2 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile InterfaceC8979m2 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        AbstractC9047z0.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8944g3 newBuilder() {
        return (C8944g3) DEFAULT_INSTANCE.createBuilder();
    }

    public static C8944g3 newBuilder(StringValue stringValue) {
        return (C8944g3) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    /* JADX INFO: renamed from: of */
    public static StringValue m21469of(String str) {
        C8944g3 c8944g3NewBuilder = newBuilder();
        c8944g3NewBuilder.m21753c();
        ((StringValue) c8944g3NewBuilder.f21118b).setValue(str);
        return (StringValue) c8944g3NewBuilder.m21751a();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (StringValue) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static StringValue parseFrom(AbstractC9011s abstractC9011s) throws C8984n1 {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s);
    }

    public static StringValue parseFrom(AbstractC9011s abstractC9011s, C8947h0 c8947h0) throws C8984n1 {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s, c8947h0);
    }

    public static StringValue parseFrom(AbstractC9031w abstractC9031w) throws IOException {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w);
    }

    public static StringValue parseFrom(AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws IOException {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w, c8947h0);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws C8984n1 {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, C8947h0 c8947h0) throws C8984n1 {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, c8947h0);
    }

    public static StringValue parseFrom(byte[] bArr) throws C8984n1 {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, C8947h0 c8947h0) throws C8984n1 {
        return (StringValue) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr, c8947h0);
    }

    public static InterfaceC8979m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(AbstractC9011s abstractC9011s) {
        abstractC9011s.getClass();
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.value_ = abstractC9011s.m21714f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9047z0
    public final Object dynamicMethod(EnumC9042y0 enumC9042y0, Object obj, Object obj2) {
        InterfaceC8979m2 c9022u0;
        switch (AbstractC8938f3.f21017a[enumC9042y0.ordinal()]) {
            case 1:
                return new StringValue();
            case 2:
                return new C8944g3();
            case 3:
                return AbstractC9047z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC8979m2 interfaceC8979m2 = PARSER;
                if (interfaceC8979m2 != null) {
                    return interfaceC8979m2;
                }
                synchronized (StringValue.class) {
                    c9022u0 = PARSER;
                    if (c9022u0 == null) {
                        c9022u0 = new C9022u0();
                        PARSER = c9022u0;
                    }
                    break;
                }
                return c9022u0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getValue() {
        return this.value_;
    }

    public AbstractC9011s getValueBytes() {
        return AbstractC9011s.m21713a(this.value_);
    }
}
