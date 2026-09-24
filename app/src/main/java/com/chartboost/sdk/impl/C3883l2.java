package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002\b\u001dBQ\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u00105\u001a\u00020\r\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000106¢\u0006\u0004\b=\u0010>Bg\b\u0011\u0012\u0006\u0010?\u001a\u00020\r\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010*\u0012\b\b\u0001\u00105\u001a\u00020\r\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u000106\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b=\u0010BJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u001a\u001a\u0004\b&\u0010'R\"\u00100\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u001a\u001a\u0004\b-\u0010.R \u00105\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010\u001a\u001a\u0004\b3\u0010\u000fR\"\u0010<\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u001a\u001a\u0004\b9\u0010:¨\u0006D"}, m43475d2 = {"Lcom/chartboost/sdk/impl/l2;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/l2;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lcom/chartboost/sdk/impl/s9;", "Ljava/util/List;", "getImp", "()Ljava/util/List;", "getImp$annotations", "()V", "imp", "Lcom/chartboost/sdk/impl/m1;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/chartboost/sdk/impl/m1;", "getApp", "()Lcom/chartboost/sdk/impl/m1;", "getApp$annotations", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "Lcom/chartboost/sdk/impl/g6;", "c", "Lcom/chartboost/sdk/impl/g6;", "getDevice", "()Lcom/chartboost/sdk/impl/g6;", "getDevice$annotations", C11744X3.i.f26328G, "Lcom/chartboost/sdk/impl/xi;", "d", "Lcom/chartboost/sdk/impl/xi;", "getUser", "()Lcom/chartboost/sdk/impl/xi;", "getUser$annotations", "user", "e", "I", "getTest", "getTest$annotations", "test", "Lcom/chartboost/sdk/impl/kf;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/chartboost/sdk/impl/kf;", "getRegs", "()Lcom/chartboost/sdk/impl/kf;", "getRegs$annotations", "regs", "<init>", "(Ljava/util/List;Lcom/chartboost/sdk/impl/m1;Lcom/chartboost/sdk/impl/g6;Lcom/chartboost/sdk/impl/xi;ILcom/chartboost/sdk/impl/kf;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/chartboost/sdk/impl/m1;Lcom/chartboost/sdk/impl/g6;Lcom/chartboost/sdk/impl/xi;ILcom/chartboost/sdk/impl/kf;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
@Serializable
public final /* data */ class C3883l2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f15182g = {new ArrayListSerializer(C4046s9.a.f16237a), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List imp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C3905m1 app;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C3772g6 device;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C4165xi user;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int test;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final C3873kf regs;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l2$a */
    public static final class a implements GeneratedSerializer {

        /* JADX INFO: renamed from: a */
        public static final a f15189a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f15190b;

        static {
            a aVar = new a();
            f15189a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.BidRequest", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement("imp", true);
            pluginGeneratedSerialDescriptor.addElement(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
            pluginGeneratedSerialDescriptor.addElement(C11744X3.i.f26328G, true);
            pluginGeneratedSerialDescriptor.addElement("user", true);
            pluginGeneratedSerialDescriptor.addElement("test", true);
            pluginGeneratedSerialDescriptor.addElement("regs", true);
            f15190b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3883l2 deserialize(Decoder decoder) {
            int i;
            C3873kf c3873kf;
            C4165xi c4165xi;
            C3772g6 c3772g6;
            C3905m1 c3905m1;
            List list;
            int i2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArr = C3883l2.f15182g;
            int i3 = 5;
            int i4 = 0;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
                C3905m1 c3905m2 = (C3905m1) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, C3905m1.a.f15316a, null);
                C3772g6 c3772g7 = (C3772g6) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, C3772g6.a.f14284a, null);
                C4165xi c4165xi2 = (C4165xi) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, C4165xi.a.f16971a, null);
                int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 4);
                list = list2;
                c3905m1 = c3905m2;
                c3873kf = (C3873kf) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, C3873kf.a.f15127a, null);
                c4165xi = c4165xi2;
                i = iDecodeIntElement;
                c3772g6 = c3772g7;
                i2 = 63;
            } else {
                int i5 = 1;
                int iDecodeIntElement2 = 0;
                List list3 = null;
                C3905m1 c3905m3 = null;
                C3772g6 c3772g8 = null;
                C4165xi c4165xi3 = null;
                C3873kf c3873kf2 = null;
                int i6 = 0;
                while (i5 != 0) {
                    int i7 = i4;
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            i4 = i7;
                            i5 = i4;
                            i3 = 5;
                            break;
                        case 0:
                            list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, i7, kSerializerArr[i7], list3);
                            i6 |= 1;
                            i4 = i7;
                            i3 = 5;
                            break;
                        case 1:
                            c3905m3 = (C3905m1) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, C3905m1.a.f15316a, c3905m3);
                            i6 |= 2;
                            i4 = i7;
                            break;
                        case 2:
                            c3772g8 = (C3772g6) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, C3772g6.a.f14284a, c3772g8);
                            i6 |= 4;
                            i4 = i7;
                            break;
                        case 3:
                            c4165xi3 = (C4165xi) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, C4165xi.a.f16971a, c4165xi3);
                            i6 |= 8;
                            i4 = i7;
                            break;
                        case 4:
                            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 4);
                            i6 |= 16;
                            i4 = i7;
                            break;
                        case 5:
                            c3873kf2 = (C3873kf) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, C3873kf.a.f15127a, c3873kf2);
                            i6 |= 32;
                            i4 = i7;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                i = iDecodeIntElement2;
                c3873kf = c3873kf2;
                c4165xi = c4165xi3;
                c3772g6 = c3772g8;
                c3905m1 = c3905m3;
                list = list3;
                i2 = i6;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new C3883l2(i2, list, c3905m1, c3772g6, c4165xi, i, c3873kf, null);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C3883l2 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            C3883l2.m18478a(value, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            return new KSerializer[]{C3883l2.f15182g[0], BuiltinSerializersKt.getNullable(C3905m1.a.f15316a), BuiltinSerializersKt.getNullable(C3772g6.a.f14284a), BuiltinSerializersKt.getNullable(C4165xi.a.f16971a), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(C3873kf.a.f15127a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return f15190b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l2$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C3883l2> serializer() {
            return a.f15189a;
        }
    }

    public /* synthetic */ C3883l2(int i, List list, C3905m1 c3905m1, C3772g6 c3772g6, C4165xi c4165xi, int i2, C3873kf c3873kf, SerializationConstructorMarker serializationConstructorMarker) {
        this.imp = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            this.app = null;
        } else {
            this.app = c3905m1;
        }
        if ((i & 4) == 0) {
            this.device = null;
        } else {
            this.device = c3772g6;
        }
        if ((i & 8) == 0) {
            this.user = null;
        } else {
            this.user = c4165xi;
        }
        if ((i & 16) == 0) {
            this.test = 0;
        } else {
            this.test = i2;
        }
        if ((i & 32) == 0) {
            this.regs = null;
        } else {
            this.regs = c3873kf;
        }
    }

    public C3883l2(List imp, C3905m1 c3905m1, C3772g6 c3772g6, C4165xi c4165xi, int i, C3873kf c3873kf) {
        Intrinsics.checkNotNullParameter(imp, "imp");
        this.imp = imp;
        this.app = c3905m1;
        this.device = c3772g6;
        this.user = c4165xi;
        this.test = i;
        this.regs = c3873kf;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m18478a(C3883l2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f15182g;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.imp, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.imp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.app != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C3905m1.a.f15316a, self.app);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.device != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, C3772g6.a.f14284a, self.device);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.user != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, C4165xi.a.f16971a, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.test != 0) {
            output.encodeIntElement(serialDesc, 4, self.test);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.regs == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, C3873kf.a.f15127a, self.regs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3883l2)) {
            return false;
        }
        C3883l2 c3883l2 = (C3883l2) other;
        return Intrinsics.areEqual(this.imp, c3883l2.imp) && Intrinsics.areEqual(this.app, c3883l2.app) && Intrinsics.areEqual(this.device, c3883l2.device) && Intrinsics.areEqual(this.user, c3883l2.user) && this.test == c3883l2.test && Intrinsics.areEqual(this.regs, c3883l2.regs);
    }

    public int hashCode() {
        int iHashCode = this.imp.hashCode() * 31;
        C3905m1 c3905m1 = this.app;
        int iHashCode2 = (iHashCode + (c3905m1 == null ? 0 : c3905m1.hashCode())) * 31;
        C3772g6 c3772g6 = this.device;
        int iHashCode3 = (iHashCode2 + (c3772g6 == null ? 0 : c3772g6.hashCode())) * 31;
        C4165xi c4165xi = this.user;
        int iHashCode4 = (((iHashCode3 + (c4165xi == null ? 0 : c4165xi.hashCode())) * 31) + this.test) * 31;
        C3873kf c3873kf = this.regs;
        return iHashCode4 + (c3873kf != null ? c3873kf.hashCode() : 0);
    }

    public String toString() {
        return "BidRequest(imp=" + this.imp + ", app=" + this.app + ", device=" + this.device + ", user=" + this.user + ", test=" + this.test + ", regs=" + this.regs + ")";
    }
}
