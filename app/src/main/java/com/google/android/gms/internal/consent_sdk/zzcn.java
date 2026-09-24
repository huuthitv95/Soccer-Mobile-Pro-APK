package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcn {
    public String zza;
    public String zzb;
    public String zzc;
    public String zzf;
    public int zzg = 1;
    public List zzd = Collections.EMPTY_LIST;
    public List zze = Collections.EMPTY_LIST;
    public int zzh = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x011b  */
    public static zzcn zza(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        int i;
        zzcn zzcnVar = new zzcn();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i2 = 4;
            int i3 = 3;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    String strNextString = jsonReader.nextString();
                    switch (strNextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i2 = 1;
                            zzcnVar.zzg = i2;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i2 = 2;
                            zzcnVar.zzg = i2;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i2 = 3;
                            zzcnVar.zzg = i2;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            zzcnVar.zzg = i2;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i2 = 5;
                            zzcnVar.zzg = i2;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            i2 = 6;
                            zzcnVar.zzg = i2;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            i2 = 7;
                            zzcnVar.zzg = i2;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i2 = 8;
                            zzcnVar.zzg = i2;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(String.valueOf(strNextString)));
                    }
                    break;
                case "consent_form_payload":
                    zzcnVar.zza = jsonReader.nextString();
                    break;
                case "consent_form_base_url":
                    zzcnVar.zzb = jsonReader.nextString();
                    break;
                case "error_message":
                    zzcnVar.zzc = jsonReader.nextString();
                    break;
                case "request_info_keys":
                    zzcnVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzcnVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case "actions":
                    zzcnVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzcm zzcmVar = new zzcm();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != -2105551094) {
                                if (iHashCode == 1583758243 && strNextName.equals(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (strNextName.equals("args_json")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                String strNextString2 = jsonReader.nextString();
                                int iHashCode2 = strNextString2.hashCode();
                                if (iHashCode2 != 64208429) {
                                    if (iHashCode2 != 82862015) {
                                        if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                            b2 = 0;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strNextString2.equals("WRITE")) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strNextString2.equals("CLEAR")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                                if (b2 == 0) {
                                    i = 1;
                                } else if (b2 == 1) {
                                    i = 2;
                                } else {
                                    if (b2 != 2) {
                                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(String.valueOf(strNextString2)));
                                    }
                                    i = 3;
                                }
                                zzcmVar.zzb = i;
                            } else if (b != 1) {
                                jsonReader.skipValue();
                            } else {
                                zzcmVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzcnVar.zze.add(zzcmVar);
                    }
                    jsonReader.endArray();
                    break;
                case "privacy_options_required":
                    String strNextString3 = jsonReader.nextString();
                    int iHashCode3 = strNextString3.hashCode();
                    if (iHashCode3 != -1888946261) {
                        if (iHashCode3 != 389487519) {
                            if (iHashCode3 != 433141802 || !strNextString3.equals("UNKNOWN")) {
                            }
                        } else if (strNextString3.equals("REQUIRED")) {
                        }
                    } else if (strNextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r8 == 0) {
                        i3 = 1;
                    } else if (r8 == 1) {
                        i3 = 2;
                    } else if (r8 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(String.valueOf(strNextString3)));
                    }
                    zzcnVar.zzh = i3;
                    break;
                case "client_side_pingback_url":
                    zzcnVar.zzf = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzcnVar;
    }
}
