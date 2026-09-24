package com.chartboost.sdk.impl;

import com.ironsource.C11744X3;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xi */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\b\u001aB\u001f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010!B3\b\u0011\u0012\u0006\u0010\"\u001a\u00020\r\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\fR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, m43475d2 = {"Lcom/chartboost/sdk/impl/xi;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/xi;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConsent", "getConsent$annotations", "()V", C11744X3.j.f26435b0, "Lcom/chartboost/sdk/impl/zi;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/chartboost/sdk/impl/zi;", "getExt", "()Lcom/chartboost/sdk/impl/zi;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/String;Lcom/chartboost/sdk/impl/zi;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/chartboost/sdk/impl/zi;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
@Serializable
public final /* data */ class C4165xi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String consent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C4209zi ext;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xi$a */
    public static final class a implements GeneratedSerializer {

        /* JADX INFO: renamed from: a */
        public static final a f16971a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f16972b;

        static {
            a aVar = new a();
            f16971a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.User", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement(C11744X3.j.f26435b0, true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            f16972b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4165xi deserialize(Decoder decoder) {
            String str;
            C4209zi c4209zi;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, null);
                c4209zi = (C4209zi) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, C4209zi.a.f17152a, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                str = null;
                C4209zi c4209zi2 = null;
                while (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str);
                        i2 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        c4209zi2 = (C4209zi) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, C4209zi.a.f17152a, c4209zi2);
                        i2 |= 2;
                    }
                }
                c4209zi = c4209zi2;
                i = i2;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new C4165xi(i, str, c4209zi, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C4165xi value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            C4165xi.m19977a(value, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(C4209zi.a.f17152a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return f16972b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xi$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C4165xi> serializer() {
            return a.f16971a;
        }
    }

    public /* synthetic */ C4165xi(int i, String str, C4209zi c4209zi, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.consent = null;
        } else {
            this.consent = str;
        }
        if ((i & 2) == 0) {
            this.ext = null;
        } else {
            this.ext = c4209zi;
        }
    }

    public C4165xi(String str, C4209zi c4209zi) {
        this.consent = str;
        this.ext = c4209zi;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m19977a(C4165xi self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.consent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.consent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, C4209zi.a.f17152a, self.ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4165xi)) {
            return false;
        }
        C4165xi c4165xi = (C4165xi) other;
        return Intrinsics.areEqual(this.consent, c4165xi.consent) && Intrinsics.areEqual(this.ext, c4165xi.ext);
    }

    public int hashCode() {
        String str = this.consent;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C4209zi c4209zi = this.ext;
        return iHashCode + (c4209zi != null ? c4209zi.hashCode() : 0);
    }

    public String toString() {
        return "User(consent=" + this.consent + ", ext=" + this.ext + ")";
    }
}
