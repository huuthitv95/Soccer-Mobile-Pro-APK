package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.protobuf.AbstractC8910b;
import com.fyber.inneractive.sdk.protobuf.AbstractC9011s;
import com.fyber.inneractive.sdk.protobuf.AbstractC9031w;
import com.fyber.inneractive.sdk.protobuf.AbstractC9047z0;
import com.fyber.inneractive.sdk.protobuf.C8947h0;
import com.fyber.inneractive.sdk.protobuf.C8984n1;
import com.fyber.inneractive.sdk.protobuf.C9022u0;
import com.fyber.inneractive.sdk.protobuf.EnumC9042y0;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8931e2;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8979m2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class IgniteResponseOuterClass$IgniteResponse extends AbstractC9047z0 implements InterfaceC8931e2 {
    public static final int CLIENTID_FIELD_NUMBER = 1;
    public static final int CLIENTSECRET_FIELD_NUMBER = 2;
    private static final IgniteResponseOuterClass$IgniteResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC8979m2 PARSER;
    private int bitField0_;
    private String clientId_ = "";
    private String clientSecret_ = "";

    static {
        IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse = new IgniteResponseOuterClass$IgniteResponse();
        DEFAULT_INSTANCE = igniteResponseOuterClass$IgniteResponse;
        AbstractC9047z0.registerDefaultInstance(IgniteResponseOuterClass$IgniteResponse.class, igniteResponseOuterClass$IgniteResponse);
    }

    private IgniteResponseOuterClass$IgniteResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientId() {
        this.bitField0_ &= -2;
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientSecret() {
        this.bitField0_ &= -3;
        this.clientSecret_ = getDefaultInstance().getClientSecret();
    }

    public static IgniteResponseOuterClass$IgniteResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8257q newBuilder() {
        return (C8257q) DEFAULT_INSTANCE.createBuilder();
    }

    public static C8257q newBuilder(IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse) {
        return (C8257q) DEFAULT_INSTANCE.createBuilder(igniteResponseOuterClass$IgniteResponse);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseDelimitedFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(AbstractC9011s abstractC9011s) throws C8984n1 {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(AbstractC9011s abstractC9011s, C8947h0 c8947h0) throws C8984n1 {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s, c8947h0);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(AbstractC9031w abstractC9031w) throws IOException {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws IOException {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w, c8947h0);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(InputStream inputStream) throws IOException {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(ByteBuffer byteBuffer) throws C8984n1 {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(ByteBuffer byteBuffer, C8947h0 c8947h0) throws C8984n1 {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, c8947h0);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(byte[] bArr) throws C8984n1 {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IgniteResponseOuterClass$IgniteResponse parseFrom(byte[] bArr, C8947h0 c8947h0) throws C8984n1 {
        return (IgniteResponseOuterClass$IgniteResponse) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr, c8947h0);
    }

    public static InterfaceC8979m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.clientId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientIdBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.clientId_ = abstractC9011s.m21714f();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSecret(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.clientSecret_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSecretBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.clientSecret_ = abstractC9011s.m21714f();
        this.bitField0_ |= 2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9047z0
    public final Object dynamicMethod(EnumC9042y0 enumC9042y0, Object obj, Object obj2) {
        InterfaceC8979m2 c9022u0;
        switch (AbstractC8256p.f18425a[enumC9042y0.ordinal()]) {
            case 1:
                return new IgniteResponseOuterClass$IgniteResponse();
            case 2:
                return new C8257q();
            case 3:
                return AbstractC9047z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "clientId_", "clientSecret_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC8979m2 interfaceC8979m2 = PARSER;
                if (interfaceC8979m2 != null) {
                    return interfaceC8979m2;
                }
                synchronized (IgniteResponseOuterClass$IgniteResponse.class) {
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

    public String getClientId() {
        return this.clientId_;
    }

    public AbstractC9011s getClientIdBytes() {
        return AbstractC9011s.m21713a(this.clientId_);
    }

    public String getClientSecret() {
        return this.clientSecret_;
    }

    public AbstractC9011s getClientSecretBytes() {
        return AbstractC9011s.m21713a(this.clientSecret_);
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClientSecret() {
        return (this.bitField0_ & 2) != 0;
    }
}
