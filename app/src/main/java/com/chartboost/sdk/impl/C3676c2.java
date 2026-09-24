package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002\b\u001aB+\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b%\u0010&B?\b\u0011\u0012\u0006\u0010'\u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\"¨\u0006,"}, m43475d2 = {"Lcom/chartboost/sdk/impl/c2;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/c2;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getW", "()Ljava/lang/Integer;", "getW$annotations", "()V", "w", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "getH", "getH$annotations", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/chartboost/sdk/impl/e2;", "c", "Lcom/chartboost/sdk/impl/e2;", "getExt", "()Lcom/chartboost/sdk/impl/e2;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/chartboost/sdk/impl/e2;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lcom/chartboost/sdk/impl/e2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
@Serializable
public final /* data */ class C3676c2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Integer w;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Integer h;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C3722e2 ext;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c2$a */
    public static final class a implements GeneratedSerializer {

        /* JADX INFO: renamed from: a */
        public static final a f13653a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f13654b;

        static {
            a aVar = new a();
            f13653a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Banner", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement(CmcdData.Factory.STREAMING_FORMAT_HLS, true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            f13654b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3676c2 deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            C3722e2 c3722e2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            Integer num3 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, intSerializer, null);
                c3722e2 = (C3722e2) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, C3722e2.a.f14004a, null);
                i = 7;
                num = num4;
            } else {
                boolean z = true;
                int i2 = 0;
                Integer num5 = null;
                C3722e2 c3722e3 = null;
                while (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num3);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num5);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        c3722e3 = (C3722e2) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, C3722e2.a.f14004a, c3722e3);
                        i2 |= 4;
                    }
                }
                i = i2;
                num = num3;
                num2 = num5;
                c3722e2 = c3722e3;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new C3676c2(i, num, num2, c3722e2, null);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C3676c2 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            C3676c2.m17015a(value, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(C3722e2.a.f14004a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return f13654b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c2$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C3676c2> serializer() {
            return a.f13653a;
        }
    }

    public /* synthetic */ C3676c2(int i, Integer num, Integer num2, C3722e2 c3722e2, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.ext = null;
        } else {
            this.ext = c3722e2;
        }
    }

    public C3676c2(Integer num, Integer num2, C3722e2 c3722e2) {
        this.w = num;
        this.h = num2;
        this.ext = c3722e2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m17015a(C3676c2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.h);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, C3722e2.a.f14004a, self.ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3676c2)) {
            return false;
        }
        C3676c2 c3676c2 = (C3676c2) other;
        return Intrinsics.areEqual(this.w, c3676c2.w) && Intrinsics.areEqual(this.h, c3676c2.h) && Intrinsics.areEqual(this.ext, c3676c2.ext);
    }

    public int hashCode() {
        Integer num = this.w;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.h;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        C3722e2 c3722e2 = this.ext;
        return iHashCode2 + (c3722e2 != null ? c3722e2.hashCode() : 0);
    }

    public String toString() {
        return "Banner(w=" + this.w + ", h=" + this.h + ", ext=" + this.ext + ")";
    }
}
