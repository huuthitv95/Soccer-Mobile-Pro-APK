package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class UInt32Value extends AbstractC9047z0 implements InterfaceC8931e2 {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile InterfaceC8979m2 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        AbstractC9047z0.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }

    private UInt32Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8962j3 newBuilder() {
        return (C8962j3) DEFAULT_INSTANCE.createBuilder();
    }

    public static C8962j3 newBuilder(UInt32Value uInt32Value) {
        return (C8962j3) DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    /* JADX INFO: renamed from: of */
    public static UInt32Value m21470of(int i) {
        C8962j3 c8962j3NewBuilder = newBuilder();
        c8962j3NewBuilder.m21753c();
        ((UInt32Value) c8962j3NewBuilder.f21118b).setValue(i);
        return (UInt32Value) c8962j3NewBuilder.m21751a();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (UInt32Value) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static UInt32Value parseFrom(AbstractC9011s abstractC9011s) throws C8984n1 {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s);
    }

    public static UInt32Value parseFrom(AbstractC9011s abstractC9011s, C8947h0 c8947h0) throws C8984n1 {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s, c8947h0);
    }

    public static UInt32Value parseFrom(AbstractC9031w abstractC9031w) throws IOException {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w);
    }

    public static UInt32Value parseFrom(AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws IOException {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w, c8947h0);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws C8984n1 {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, C8947h0 c8947h0) throws C8984n1 {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, c8947h0);
    }

    public static UInt32Value parseFrom(byte[] bArr) throws C8984n1 {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, C8947h0 c8947h0) throws C8984n1 {
        return (UInt32Value) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr, c8947h0);
    }

    public static InterfaceC8979m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9047z0
    public final Object dynamicMethod(EnumC9042y0 enumC9042y0, Object obj, Object obj2) {
        InterfaceC8979m2 c9022u0;
        switch (AbstractC8956i3.f21050a[enumC9042y0.ordinal()]) {
            case 1:
                return new UInt32Value();
            case 2:
                return new C8962j3();
            case 3:
                return AbstractC9047z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC8979m2 interfaceC8979m2 = PARSER;
                if (interfaceC8979m2 != null) {
                    return interfaceC8979m2;
                }
                synchronized (UInt32Value.class) {
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

    public int getValue() {
        return this.value_;
    }
}
