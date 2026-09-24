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
public final class IgniteRequestOuterClass$IgniteRequest extends AbstractC9047z0 implements InterfaceC8931e2 {
    public static final int APPID_FIELD_NUMBER = 1;
    public static final int APPSIGNATURE_FIELD_NUMBER = 3;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    private static final IgniteRequestOuterClass$IgniteRequest DEFAULT_INSTANCE;
    public static final int IGNITEPACKAGENAME_FIELD_NUMBER = 4;
    public static final int IGNITEVERSIONNAME_FIELD_NUMBER = 5;
    private static volatile InterfaceC8979m2 PARSER = null;
    public static final int SDKVERSION_FIELD_NUMBER = 6;
    private int bitField0_;
    private String appId_ = "";
    private String bundle_ = "";
    private String appSignature_ = "";
    private String ignitePackageName_ = "";
    private String igniteVersionName_ = "";
    private String sdkVersion_ = "";

    static {
        IgniteRequestOuterClass$IgniteRequest igniteRequestOuterClass$IgniteRequest = new IgniteRequestOuterClass$IgniteRequest();
        DEFAULT_INSTANCE = igniteRequestOuterClass$IgniteRequest;
        AbstractC9047z0.registerDefaultInstance(IgniteRequestOuterClass$IgniteRequest.class, igniteRequestOuterClass$IgniteRequest);
    }

    private IgniteRequestOuterClass$IgniteRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppId() {
        this.bitField0_ &= -2;
        this.appId_ = getDefaultInstance().getAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppSignature() {
        this.bitField0_ &= -5;
        this.appSignature_ = getDefaultInstance().getAppSignature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundle() {
        this.bitField0_ &= -3;
        this.bundle_ = getDefaultInstance().getBundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnitePackageName() {
        this.bitField0_ &= -9;
        this.ignitePackageName_ = getDefaultInstance().getIgnitePackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgniteVersionName() {
        this.bitField0_ &= -17;
        this.igniteVersionName_ = getDefaultInstance().getIgniteVersionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -33;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    public static IgniteRequestOuterClass$IgniteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8255o newBuilder() {
        return (C8255o) DEFAULT_INSTANCE.createBuilder();
    }

    public static C8255o newBuilder(IgniteRequestOuterClass$IgniteRequest igniteRequestOuterClass$IgniteRequest) {
        return (C8255o) DEFAULT_INSTANCE.createBuilder(igniteRequestOuterClass$IgniteRequest);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseDelimitedFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(AbstractC9011s abstractC9011s) throws C8984n1 {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(AbstractC9011s abstractC9011s, C8947h0 c8947h0) throws C8984n1 {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9011s, c8947h0);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(AbstractC9031w abstractC9031w) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, abstractC9031w, c8947h0);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(InputStream inputStream) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(InputStream inputStream, C8947h0 c8947h0) throws IOException {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, inputStream, c8947h0);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(ByteBuffer byteBuffer) throws C8984n1 {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(ByteBuffer byteBuffer, C8947h0 c8947h0) throws C8984n1 {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, c8947h0);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(byte[] bArr) throws C8984n1 {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IgniteRequestOuterClass$IgniteRequest parseFrom(byte[] bArr, C8947h0 c8947h0) throws C8984n1 {
        return (IgniteRequestOuterClass$IgniteRequest) AbstractC9047z0.parseFrom(DEFAULT_INSTANCE, bArr, c8947h0);
    }

    public static InterfaceC8979m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.appId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppIdBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.appId_ = abstractC9011s.m21714f();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppSignature(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.appSignature_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppSignatureBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.appSignature_ = abstractC9011s.m21714f();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundle(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.bundle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.bundle_ = abstractC9011s.m21714f();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnitePackageName(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.ignitePackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnitePackageNameBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.ignitePackageName_ = abstractC9011s.m21714f();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteVersionName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.igniteVersionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteVersionNameBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.igniteVersionName_ = abstractC9011s.m21714f();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(AbstractC9011s abstractC9011s) {
        AbstractC8910b.checkByteStringIsUtf8(abstractC9011s);
        this.sdkVersion_ = abstractC9011s.m21714f();
        this.bitField0_ |= 32;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9047z0
    public final Object dynamicMethod(EnumC9042y0 enumC9042y0, Object obj, Object obj2) {
        InterfaceC8979m2 c9022u0;
        switch (AbstractC8254n.f18424a[enumC9042y0.ordinal()]) {
            case 1:
                return new IgniteRequestOuterClass$IgniteRequest();
            case 2:
                return new C8255o();
            case 3:
                return AbstractC9047z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "appId_", "bundle_", "appSignature_", "ignitePackageName_", "igniteVersionName_", "sdkVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC8979m2 interfaceC8979m2 = PARSER;
                if (interfaceC8979m2 != null) {
                    return interfaceC8979m2;
                }
                synchronized (IgniteRequestOuterClass$IgniteRequest.class) {
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

    public String getAppId() {
        return this.appId_;
    }

    public AbstractC9011s getAppIdBytes() {
        return AbstractC9011s.m21713a(this.appId_);
    }

    public String getAppSignature() {
        return this.appSignature_;
    }

    public AbstractC9011s getAppSignatureBytes() {
        return AbstractC9011s.m21713a(this.appSignature_);
    }

    public String getBundle() {
        return this.bundle_;
    }

    public AbstractC9011s getBundleBytes() {
        return AbstractC9011s.m21713a(this.bundle_);
    }

    public String getIgnitePackageName() {
        return this.ignitePackageName_;
    }

    public AbstractC9011s getIgnitePackageNameBytes() {
        return AbstractC9011s.m21713a(this.ignitePackageName_);
    }

    public String getIgniteVersionName() {
        return this.igniteVersionName_;
    }

    public AbstractC9011s getIgniteVersionNameBytes() {
        return AbstractC9011s.m21713a(this.igniteVersionName_);
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public AbstractC9011s getSdkVersionBytes() {
        return AbstractC9011s.m21713a(this.sdkVersion_);
    }

    public boolean hasAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAppSignature() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBundle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIgnitePackageName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIgniteVersionName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 32) != 0;
    }
}
