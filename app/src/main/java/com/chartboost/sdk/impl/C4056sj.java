package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
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

/* JADX INFO: renamed from: com.chartboost.sdk.impl.sj */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0002\b\u001aBI\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010*¢\u0006\u0004\b1\u00102B]\b\u0011\u0012\u0006\u00103\u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010*\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b1\u00106J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010!\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R(\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010'R\"\u00100\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0018\u001a\u0004\b-\u0010.¨\u00068"}, m43475d2 = {"Lcom/chartboost/sdk/impl/sj;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/sj;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getW", "()Ljava/lang/Integer;", "getW$annotations", "()V", "w", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "getH", "getH$annotations", CmcdData.Factory.STREAMING_FORMAT_HLS, "c", "getPlacement", "getPlacement$annotations", "placement", "", "Lcom/chartboost/sdk/impl/t4;", "d", "Ljava/util/List;", "getCompanionAd", "()Ljava/util/List;", "getCompanionAd$annotations", "companionAd", "Lcom/chartboost/sdk/impl/ak;", "e", "Lcom/chartboost/sdk/impl/ak;", "getExt", "()Lcom/chartboost/sdk/impl/ak;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/chartboost/sdk/impl/ak;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/chartboost/sdk/impl/ak;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
@Serializable
public final /* data */ class C4056sj {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f16288f = {null, null, null, new ArrayListSerializer(C4063t4.a.f16318a), null};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Integer w;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Integer h;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer placement;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List companionAd;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final C3648ak ext;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.sj$a */
    public static final class a implements GeneratedSerializer {

        /* JADX INFO: renamed from: a */
        public static final a f16294a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f16295b;

        static {
            a aVar = new a();
            f16294a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Video", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement(CmcdData.Factory.STREAMING_FORMAT_HLS, true);
            pluginGeneratedSerialDescriptor.addElement("placement", true);
            pluginGeneratedSerialDescriptor.addElement("companionad", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            f16295b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4056sj deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            Integer num3;
            List list;
            C3648ak c3648ak;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArr = C4056sj.f16288f;
            Integer num4 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, intSerializer, null);
                Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, intSerializer, null);
                list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, kSerializerArr[3], null);
                num3 = num7;
                c3648ak = (C3648ak) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, C3648ak.a.f13481a, null);
                i = 31;
                num2 = num6;
                num = num5;
            } else {
                boolean z = true;
                int i2 = 0;
                Integer num8 = null;
                Integer num9 = null;
                List list2 = null;
                C3648ak c3648ak2 = null;
                while (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num4);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num8);
                        i2 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, num9);
                        i2 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, kSerializerArr[3], list2);
                        i2 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        c3648ak2 = (C3648ak) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, C3648ak.a.f13481a, c3648ak2);
                        i2 |= 16;
                    }
                }
                i = i2;
                num = num4;
                num2 = num8;
                num3 = num9;
                list = list2;
                c3648ak = c3648ak2;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new C4056sj(i, num, num2, num3, list, c3648ak, null);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C4056sj value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            C4056sj.m19441a(value, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = C4056sj.f16288f;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(C3648ak.a.f13481a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return f16295b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.sj$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C4056sj> serializer() {
            return a.f16294a;
        }
    }

    public /* synthetic */ C4056sj(int i, Integer num, Integer num2, Integer num3, List list, C3648ak c3648ak, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.w = null;
        } else {
            this.w = num;
        }
        if ((i & 2) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 4) == 0) {
            this.placement = null;
        } else {
            this.placement = num3;
        }
        if ((i & 8) == 0) {
            this.companionAd = null;
        } else {
            this.companionAd = list;
        }
        if ((i & 16) == 0) {
            this.ext = null;
        } else {
            this.ext = c3648ak;
        }
    }

    public C4056sj(Integer num, Integer num2, Integer num3, List list, C3648ak c3648ak) {
        this.w = num;
        this.h = num2;
        this.placement = num3;
        this.companionAd = list;
        this.ext = c3648ak;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m19441a(C4056sj self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f16288f;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.placement != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.placement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.companionAd != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.companionAd);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, C3648ak.a.f13481a, self.ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4056sj)) {
            return false;
        }
        C4056sj c4056sj = (C4056sj) other;
        return Intrinsics.areEqual(this.w, c4056sj.w) && Intrinsics.areEqual(this.h, c4056sj.h) && Intrinsics.areEqual(this.placement, c4056sj.placement) && Intrinsics.areEqual(this.companionAd, c4056sj.companionAd) && Intrinsics.areEqual(this.ext, c4056sj.ext);
    }

    public int hashCode() {
        Integer num = this.w;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.h;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.placement;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.companionAd;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        C3648ak c3648ak = this.ext;
        return iHashCode4 + (c3648ak != null ? c3648ak.hashCode() : 0);
    }

    public String toString() {
        return "Video(w=" + this.w + ", h=" + this.h + ", placement=" + this.placement + ", companionAd=" + this.companionAd + ", ext=" + this.ext + ")";
    }
}
