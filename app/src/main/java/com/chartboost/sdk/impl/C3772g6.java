package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C11341A5;
import com.ironsource.C11540L6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002\b\u001aB»\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bX\u0010YBÏ\u0001\b\u0011\u0012\u0006\u0010Z\u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u00010:\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010P\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010Q\u0012\b\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\bX\u0010]J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\fR\"\u0010\"\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u0012\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\u0016R\"\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001b\u0012\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\fR\"\u0010*\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001b\u0012\u0004\b)\u0010\u0018\u001a\u0004\b(\u0010\fR\"\u0010.\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u001b\u0012\u0004\b-\u0010\u0018\u001a\u0004\b,\u0010\fR\"\u00102\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u001b\u0012\u0004\b1\u0010\u0018\u001a\u0004\b0\u0010\fR\"\u00103\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u0014\u0012\u0004\b5\u0010\u0018\u001a\u0004\b4\u0010\u0016R\"\u00109\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u0014\u0012\u0004\b8\u0010\u0018\u001a\u0004\b7\u0010\u0016R\"\u0010@\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010\u0018\u001a\u0004\b=\u0010>R\"\u0010D\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010\u001b\u0012\u0004\bC\u0010\u0018\u001a\u0004\bB\u0010\fR\"\u0010H\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010\u001b\u0012\u0004\bG\u0010\u0018\u001a\u0004\bF\u0010\fR\"\u0010L\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010\u0014\u0012\u0004\bK\u0010\u0018\u001a\u0004\bJ\u0010\u0016R\"\u0010P\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010\u001b\u0012\u0004\bO\u0010\u0018\u001a\u0004\bN\u0010\fR\"\u0010W\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010\u0018\u001a\u0004\bT\u0010U¨\u0006_"}, m43475d2 = {"Lcom/chartboost/sdk/impl/g6;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/g6;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getLmt", "()Ljava/lang/Integer;", "getLmt$annotations", "()V", "lmt", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "getUa", "getUa$annotations", C11540L6.f24966d0, "c", "getDeviceType", "getDeviceType$annotations", "deviceType", "d", "getMake", "getMake$annotations", C11540L6.f25013t, "e", "getModel", "getModel$annotations", C11540L6.f24899B, InneractiveMediationDefs.GENDER_FEMALE, "getOs", "getOs$annotations", C11540L6.f24911F, "g", "getOsv", "getOsv$annotations", C11540L6.f24914G, CmcdData.Factory.STREAMING_FORMAT_HLS, "getH", "getH$annotations", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "getW", "getW$annotations", "w", "", "j", "Ljava/lang/Float;", "getPxRatio", "()Ljava/lang/Float;", "getPxRatio$annotations", "pxRatio", CampaignEx.JSON_KEY_AD_K, "getLanguage", "getLanguage$annotations", "language", CmcdData.Factory.STREAM_TYPE_LIVE, "getCarrier", "getCarrier$annotations", C11540L6.f24937Q0, InneractiveMediationDefs.GENDER_MALE, "getConnectionType", "getConnectionType$annotations", "connectionType", C11341A5.f23826q, "getIfa", "getIfa$annotations", "ifa", "Lcom/chartboost/sdk/impl/j6;", "o", "Lcom/chartboost/sdk/impl/j6;", "getExt", "()Lcom/chartboost/sdk/impl/j6;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/chartboost/sdk/impl/j6;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/chartboost/sdk/impl/j6;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
@Serializable
public final /* data */ class C3772g6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Integer lmt;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String ua;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer deviceType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String make;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String model;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String os;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String osv;
    public final Integer h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Integer w;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final Float pxRatio;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final String language;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final String carrier;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final Integer connectionType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final String ifa;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final C3841j6 ext;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.g6$a */
    public static final class a implements GeneratedSerializer {

        /* JADX INFO: renamed from: a */
        public static final a f14284a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f14285b;

        static {
            a aVar = new a();
            f14284a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Device", aVar, 15);
            pluginGeneratedSerialDescriptor.addElement("lmt", true);
            pluginGeneratedSerialDescriptor.addElement(C11540L6.f24966d0, true);
            pluginGeneratedSerialDescriptor.addElement("devicetype", true);
            pluginGeneratedSerialDescriptor.addElement(C11540L6.f25013t, true);
            pluginGeneratedSerialDescriptor.addElement(C11540L6.f24899B, true);
            pluginGeneratedSerialDescriptor.addElement(C11540L6.f24911F, true);
            pluginGeneratedSerialDescriptor.addElement(C11540L6.f24914G, true);
            pluginGeneratedSerialDescriptor.addElement(CmcdData.Factory.STREAMING_FORMAT_HLS, true);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement("pxratio", true);
            pluginGeneratedSerialDescriptor.addElement("language", true);
            pluginGeneratedSerialDescriptor.addElement(C11540L6.f24937Q0, true);
            pluginGeneratedSerialDescriptor.addElement(C11341A5.f23814e, true);
            pluginGeneratedSerialDescriptor.addElement("ifa", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            f14285b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3772g6 deserialize(Decoder decoder) {
            String str;
            int i;
            Integer num;
            String str2;
            C3841j6 c3841j6;
            String str3;
            Float f;
            Integer num2;
            Integer num3;
            String str4;
            String str5;
            String str6;
            Integer num4;
            String str7;
            Integer num5;
            String str8;
            Integer num6;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
                Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, intSerializer, null);
                String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
                String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
                String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
                String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
                Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, intSerializer, null);
                Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, intSerializer, null);
                Float f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, FloatSerializer.INSTANCE, null);
                String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
                str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, stringSerializer, null);
                Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, intSerializer, null);
                i = 32767;
                f = f2;
                num3 = num7;
                num4 = num9;
                num2 = num8;
                num5 = num10;
                str6 = str13;
                str8 = str10;
                str = str12;
                str7 = str11;
                str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, stringSerializer, null);
                c3841j6 = (C3841j6) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, C3841j6.a.f14876a, null);
                str5 = str14;
                str3 = str9;
                num = num11;
            } else {
                boolean z = true;
                String str15 = null;
                C3841j6 c3841j7 = null;
                String str16 = null;
                String str17 = null;
                Float f3 = null;
                Integer num12 = null;
                Integer num13 = null;
                str = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                Integer num14 = null;
                String str21 = null;
                Integer num15 = null;
                i = 0;
                Integer num16 = null;
                while (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            num6 = num15;
                            z = false;
                            c3841j7 = c3841j7;
                            str15 = str15;
                            num15 = num6;
                            num16 = num16;
                            break;
                        case 0:
                            num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num15);
                            i |= 1;
                            c3841j7 = c3841j7;
                            str15 = str15;
                            num15 = num6;
                            num16 = num16;
                            break;
                        case 1:
                            str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str16);
                            i |= 2;
                            c3841j7 = c3841j7;
                            num16 = num16;
                            break;
                        case 2:
                            num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, num16);
                            i |= 4;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 3:
                            str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str15);
                            i |= 8;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 4:
                            str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, str20);
                            i |= 16;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 5:
                            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str);
                            i |= 32;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 6:
                            str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, str19);
                            i |= 64;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 7:
                            num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, num13);
                            i |= 128;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 8:
                            num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, IntSerializer.INSTANCE, num12);
                            i |= 256;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 9:
                            f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, FloatSerializer.INSTANCE, f3);
                            i |= 512;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 10:
                            str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, StringSerializer.INSTANCE, str18);
                            i |= 1024;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 11:
                            str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, StringSerializer.INSTANCE, str17);
                            i |= 2048;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 12:
                            str16 = str16;
                            num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, num14);
                            i |= 4096;
                            c3841j7 = c3841j7;
                            str21 = str21;
                            str16 = str16;
                            break;
                        case 13:
                            str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, StringSerializer.INSTANCE, str21);
                            i |= 8192;
                            c3841j7 = c3841j7;
                            str16 = str16;
                            break;
                        case 14:
                            c3841j7 = (C3841j6) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, C3841j6.a.f14876a, c3841j7);
                            i |= 16384;
                            str16 = str16;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                num = num14;
                str2 = str17;
                c3841j6 = c3841j7;
                str3 = str16;
                f = f3;
                num2 = num16;
                num3 = num15;
                str4 = str21;
                str5 = str18;
                str6 = str19;
                num4 = num13;
                str7 = str20;
                num5 = num12;
                str8 = str15;
            }
            int i2 = i;
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new C3772g6(i2, num3, str3, num2, str8, str7, str, str6, num4, num5, f, str5, str2, num, str4, c3841j6, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C3772g6 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            C3772g6.m17769a(value, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(C3841j6.a.f14876a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return f14285b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.g6$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C3772g6> serializer() {
            return a.f14284a;
        }
    }

    public /* synthetic */ C3772g6(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, C3841j6 c3841j6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & 2) == 0) {
            this.ua = null;
        } else {
            this.ua = str;
        }
        if ((i & 4) == 0) {
            this.deviceType = null;
        } else {
            this.deviceType = num2;
        }
        if ((i & 8) == 0) {
            this.make = null;
        } else {
            this.make = str2;
        }
        if ((i & 16) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 32) == 0) {
            this.os = null;
        } else {
            this.os = str4;
        }
        if ((i & 64) == 0) {
            this.osv = null;
        } else {
            this.osv = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.w = null;
        } else {
            this.w = num4;
        }
        if ((i & 512) == 0) {
            this.pxRatio = null;
        } else {
            this.pxRatio = f;
        }
        if ((i & 1024) == 0) {
            this.language = null;
        } else {
            this.language = str6;
        }
        if ((i & 2048) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str7;
        }
        if ((i & 4096) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = num5;
        }
        if ((i & 8192) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str8;
        }
        if ((i & 16384) == 0) {
            this.ext = null;
        } else {
            this.ext = c3841j6;
        }
    }

    public C3772g6(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, C3841j6 c3841j6) {
        this.lmt = num;
        this.ua = str;
        this.deviceType = num2;
        this.make = str2;
        this.model = str3;
        this.os = str4;
        this.osv = str5;
        this.h = num3;
        this.w = num4;
        this.pxRatio = f;
        this.language = str6;
        this.carrier = str7;
        this.connectionType = num5;
        this.ifa = str8;
        this.ext = c3841j6;
    }

    public /* synthetic */ C3772g6(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, C3841j6 c3841j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : num5, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : c3841j6);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m17769a(C3772g6 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.lmt != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.lmt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ua != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ua);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.deviceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.deviceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.make != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.make);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.model != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.model);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.os != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.os);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.osv != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.osv);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.pxRatio != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, FloatSerializer.INSTANCE, self.pxRatio);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.language != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.carrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.carrier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.connectionType != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, IntSerializer.INSTANCE, self.connectionType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.ifa != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.ifa);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 14) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 14, C3841j6.a.f14876a, self.ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3772g6)) {
            return false;
        }
        C3772g6 c3772g6 = (C3772g6) other;
        return Intrinsics.areEqual(this.lmt, c3772g6.lmt) && Intrinsics.areEqual(this.ua, c3772g6.ua) && Intrinsics.areEqual(this.deviceType, c3772g6.deviceType) && Intrinsics.areEqual(this.make, c3772g6.make) && Intrinsics.areEqual(this.model, c3772g6.model) && Intrinsics.areEqual(this.os, c3772g6.os) && Intrinsics.areEqual(this.osv, c3772g6.osv) && Intrinsics.areEqual(this.h, c3772g6.h) && Intrinsics.areEqual(this.w, c3772g6.w) && Intrinsics.areEqual((Object) this.pxRatio, (Object) c3772g6.pxRatio) && Intrinsics.areEqual(this.language, c3772g6.language) && Intrinsics.areEqual(this.carrier, c3772g6.carrier) && Intrinsics.areEqual(this.connectionType, c3772g6.connectionType) && Intrinsics.areEqual(this.ifa, c3772g6.ifa) && Intrinsics.areEqual(this.ext, c3772g6.ext);
    }

    public int hashCode() {
        Integer num = this.lmt;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ua;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.deviceType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.make;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.os;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.osv;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.w;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.pxRatio;
        int iHashCode10 = (iHashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.language;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.carrier;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.connectionType;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.ifa;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C3841j6 c3841j6 = this.ext;
        return iHashCode14 + (c3841j6 != null ? c3841j6.hashCode() : 0);
    }

    public String toString() {
        return "Device(lmt=" + this.lmt + ", ua=" + this.ua + ", deviceType=" + this.deviceType + ", make=" + this.make + ", model=" + this.model + ", os=" + this.os + ", osv=" + this.osv + ", h=" + this.h + ", w=" + this.w + ", pxRatio=" + this.pxRatio + ", language=" + this.language + ", carrier=" + this.carrier + ", connectionType=" + this.connectionType + ", ifa=" + this.ifa + ", ext=" + this.ext + ")";
    }
}
