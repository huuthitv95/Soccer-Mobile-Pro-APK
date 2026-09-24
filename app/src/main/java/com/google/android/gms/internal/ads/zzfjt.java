package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.C11744X3;
import com.ironsource.mediationsdk.C12357j;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfjt {
    public final zzccy zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfkp zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final Bundle zzaF;
    public final boolean zzaG;
    public final int zzaH;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbyv zzad;
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzcbp zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfjy zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:276:0x0742 A[PHI: r22 r24
  0x0742: PHI (r22v97 java.util.List) = 
  (r22v5 java.util.List)
  (r22v6 java.util.List)
  (r22v7 java.util.List)
  (r22v8 java.util.List)
  (r22v9 java.util.List)
  (r22v10 java.util.List)
  (r22v11 java.util.List)
  (r22v12 java.util.List)
  (r22v13 java.util.List)
  (r22v14 java.util.List)
  (r22v15 java.util.List)
  (r22v16 java.util.List)
  (r22v17 java.util.List)
  (r22v18 java.util.List)
  (r22v19 java.util.List)
  (r22v20 java.util.List)
  (r22v21 java.util.List)
  (r22v22 java.util.List)
  (r22v23 java.util.List)
  (r22v24 java.util.List)
  (r22v25 java.util.List)
  (r22v26 java.util.List)
  (r22v27 java.util.List)
  (r22v28 java.util.List)
  (r22v29 java.util.List)
  (r22v30 java.util.List)
  (r22v31 java.util.List)
  (r22v32 java.util.List)
  (r22v33 java.util.List)
  (r22v34 java.util.List)
  (r22v35 java.util.List)
  (r22v36 java.util.List)
  (r22v37 java.util.List)
  (r22v38 java.util.List)
  (r22v39 java.util.List)
  (r22v40 java.util.List)
  (r22v41 java.util.List)
  (r22v42 java.util.List)
  (r22v43 java.util.List)
  (r22v44 java.util.List)
  (r22v45 java.util.List)
  (r22v46 java.util.List)
  (r22v47 java.util.List)
  (r22v48 java.util.List)
  (r22v49 java.util.List)
  (r22v50 java.util.List)
  (r22v51 java.util.List)
  (r22v52 java.util.List)
  (r22v53 java.util.List)
  (r22v54 java.util.List)
  (r22v55 java.util.List)
  (r22v56 java.util.List)
  (r22v57 java.util.List)
  (r22v58 java.util.List)
  (r22v59 java.util.List)
  (r22v60 java.util.List)
  (r22v61 java.util.List)
  (r22v62 java.util.List)
  (r22v63 java.util.List)
  (r22v64 java.util.List)
  (r22v65 java.util.List)
  (r22v66 java.util.List)
  (r22v67 java.util.List)
  (r22v68 java.util.List)
  (r22v69 java.util.List)
  (r22v70 java.util.List)
  (r22v71 java.util.List)
  (r22v72 java.util.List)
  (r22v73 java.util.List)
  (r22v74 java.util.List)
  (r22v75 java.util.List)
  (r22v76 java.util.List)
  (r22v77 java.util.List)
  (r22v78 java.util.List)
  (r22v79 java.util.List)
  (r22v80 java.util.List)
  (r22v81 java.util.List)
  (r22v82 java.util.List)
  (r22v83 java.util.List)
  (r22v84 java.util.List)
  (r22v85 java.util.List)
  (r22v86 java.util.List)
  (r22v87 java.util.List)
  (r22v88 java.util.List)
  (r22v89 java.util.List)
  (r22v90 java.util.List)
  (r22v91 java.util.List)
  (r22v92 java.util.List)
  (r22v98 java.util.List)
 binds: [B:274:0x073d, B:271:0x072c, B:268:0x071b, B:265:0x070a, B:262:0x06f9, B:259:0x06e8, B:256:0x06d6, B:253:0x06c4, B:250:0x06b2, B:247:0x06a0, B:244:0x068e, B:241:0x067c, B:238:0x066a, B:235:0x0658, B:232:0x0646, B:229:0x0634, B:226:0x0622, B:223:0x0610, B:220:0x05fe, B:217:0x05ec, B:214:0x05da, B:211:0x05c8, B:208:0x05b6, B:205:0x05a4, B:202:0x0592, B:199:0x0580, B:196:0x056e, B:193:0x055c, B:190:0x054a, B:187:0x0538, B:184:0x0526, B:181:0x0514, B:178:0x0502, B:175:0x04f0, B:172:0x04de, B:169:0x04cc, B:166:0x04ba, B:163:0x04a8, B:160:0x0496, B:157:0x0484, B:154:0x0473, B:151:0x0461, B:148:0x044f, B:145:0x043d, B:142:0x042b, B:139:0x0419, B:136:0x0407, B:133:0x03f5, B:130:0x03e3, B:127:0x03d1, B:124:0x03bf, B:121:0x03ad, B:118:0x039b, B:115:0x0389, B:112:0x0377, B:109:0x0365, B:106:0x0353, B:103:0x0342, B:100:0x0330, B:97:0x031e, B:94:0x030c, B:91:0x02fa, B:88:0x02e8, B:85:0x02d6, B:82:0x02c4, B:79:0x02b3, B:76:0x02a1, B:73:0x028f, B:70:0x027d, B:67:0x026b, B:64:0x0259, B:61:0x0247, B:58:0x0235, B:55:0x0223, B:52:0x0211, B:49:0x01ff, B:46:0x01ed, B:43:0x01db, B:40:0x01ca, B:37:0x01b8, B:34:0x01a7, B:31:0x0195, B:28:0x0183, B:25:0x0171, B:22:0x015f, B:19:0x014d, B:16:0x013b, B:13:0x0129, B:11:0x0117] A[DONT_GENERATE, DONT_INLINE]
  0x0742: PHI (r24v91 java.util.List) = 
  (r24v2 java.util.List)
  (r24v3 java.util.List)
  (r24v4 java.util.List)
  (r24v5 java.util.List)
  (r24v6 java.util.List)
  (r24v7 java.util.List)
  (r24v8 java.util.List)
  (r24v9 java.util.List)
  (r24v10 java.util.List)
  (r24v11 java.util.List)
  (r24v12 java.util.List)
  (r24v13 java.util.List)
  (r24v14 java.util.List)
  (r24v15 java.util.List)
  (r24v16 java.util.List)
  (r24v17 java.util.List)
  (r24v18 java.util.List)
  (r24v19 java.util.List)
  (r24v20 java.util.List)
  (r24v21 java.util.List)
  (r24v22 java.util.List)
  (r24v23 java.util.List)
  (r24v24 java.util.List)
  (r24v25 java.util.List)
  (r24v26 java.util.List)
  (r24v27 java.util.List)
  (r24v28 java.util.List)
  (r24v29 java.util.List)
  (r24v30 java.util.List)
  (r24v31 java.util.List)
  (r24v32 java.util.List)
  (r24v33 java.util.List)
  (r24v34 java.util.List)
  (r24v35 java.util.List)
  (r24v36 java.util.List)
  (r24v37 java.util.List)
  (r24v38 java.util.List)
  (r24v39 java.util.List)
  (r24v40 java.util.List)
  (r24v41 java.util.List)
  (r24v42 java.util.List)
  (r24v43 java.util.List)
  (r24v44 java.util.List)
  (r24v45 java.util.List)
  (r24v46 java.util.List)
  (r24v47 java.util.List)
  (r24v48 java.util.List)
  (r24v49 java.util.List)
  (r24v50 java.util.List)
  (r24v51 java.util.List)
  (r24v52 java.util.List)
  (r24v53 java.util.List)
  (r24v54 java.util.List)
  (r24v55 java.util.List)
  (r24v56 java.util.List)
  (r24v57 java.util.List)
  (r24v58 java.util.List)
  (r24v59 java.util.List)
  (r24v60 java.util.List)
  (r24v61 java.util.List)
  (r24v62 java.util.List)
  (r24v63 java.util.List)
  (r24v64 java.util.List)
  (r24v65 java.util.List)
  (r24v66 java.util.List)
  (r24v67 java.util.List)
  (r24v68 java.util.List)
  (r24v69 java.util.List)
  (r24v70 java.util.List)
  (r24v71 java.util.List)
  (r24v72 java.util.List)
  (r24v73 java.util.List)
  (r24v74 java.util.List)
  (r24v75 java.util.List)
  (r24v76 java.util.List)
  (r24v77 java.util.List)
  (r24v78 java.util.List)
  (r24v79 java.util.List)
  (r24v80 java.util.List)
  (r24v81 java.util.List)
  (r24v82 java.util.List)
  (r24v83 java.util.List)
  (r24v84 java.util.List)
  (r24v85 java.util.List)
  (r24v86 java.util.List)
  (r24v87 java.util.List)
  (r24v88 java.util.List)
  (r24v89 java.util.List)
  (r24v92 java.util.List)
 binds: [B:274:0x073d, B:271:0x072c, B:268:0x071b, B:265:0x070a, B:262:0x06f9, B:259:0x06e8, B:256:0x06d6, B:253:0x06c4, B:250:0x06b2, B:247:0x06a0, B:244:0x068e, B:241:0x067c, B:238:0x066a, B:235:0x0658, B:232:0x0646, B:229:0x0634, B:226:0x0622, B:223:0x0610, B:220:0x05fe, B:217:0x05ec, B:214:0x05da, B:211:0x05c8, B:208:0x05b6, B:205:0x05a4, B:202:0x0592, B:199:0x0580, B:196:0x056e, B:193:0x055c, B:190:0x054a, B:187:0x0538, B:184:0x0526, B:181:0x0514, B:178:0x0502, B:175:0x04f0, B:172:0x04de, B:169:0x04cc, B:166:0x04ba, B:163:0x04a8, B:160:0x0496, B:157:0x0484, B:154:0x0473, B:151:0x0461, B:148:0x044f, B:145:0x043d, B:142:0x042b, B:139:0x0419, B:136:0x0407, B:133:0x03f5, B:130:0x03e3, B:127:0x03d1, B:124:0x03bf, B:121:0x03ad, B:118:0x039b, B:115:0x0389, B:112:0x0377, B:109:0x0365, B:106:0x0353, B:103:0x0342, B:100:0x0330, B:97:0x031e, B:94:0x030c, B:91:0x02fa, B:88:0x02e8, B:85:0x02d6, B:82:0x02c4, B:79:0x02b3, B:76:0x02a1, B:73:0x028f, B:70:0x027d, B:67:0x026b, B:64:0x0259, B:61:0x0247, B:58:0x0235, B:55:0x0223, B:52:0x0211, B:49:0x01ff, B:46:0x01ed, B:43:0x01db, B:40:0x01ca, B:37:0x01b8, B:34:0x01a7, B:31:0x0195, B:28:0x0183, B:25:0x0171, B:22:0x015f, B:19:0x014d, B:16:0x013b, B:13:0x0129, B:11:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    zzfjt(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List listZzb;
        byte b;
        List listZzb2 = Collections.EMPTY_LIST;
        List listZzb3 = Collections.EMPTY_LIST;
        List listZzb4 = Collections.EMPTY_LIST;
        List listZzb5 = Collections.EMPTY_LIST;
        List listZzb6 = Collections.EMPTY_LIST;
        List listZzb7 = Collections.EMPTY_LIST;
        List listZzb8 = Collections.EMPTY_LIST;
        List listZzb9 = Collections.EMPTY_LIST;
        List listZzb10 = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        List list4 = Collections.EMPTY_LIST;
        List list5 = Collections.EMPTY_LIST;
        List list6 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgvz.zzi();
        zzgvz zzgvzVarZzi = zzgvz.zzi();
        HashMap map = new HashMap();
        zzgvz zzgvzVarZzi2 = zzgvz.zzi();
        zzgvz zzgvzVarZzi3 = zzgvz.zzi();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        JSONObject jSONObjectZzd = jSONObject2;
        JSONObject jSONObjectZzd2 = jSONObject3;
        JSONObject jSONObjectZzd3 = jSONObject4;
        JSONObject jSONObjectZzd4 = jSONObject5;
        JSONObject jSONObjectZzd5 = jSONObject6;
        List listZzb11 = zzgvzVarZzi;
        Map mapZzc = map;
        List listZzb12 = zzgvzVarZzi2;
        zzgvz zzgvzVarZza = zzgvzVarZzi3;
        Bundle bundle2 = bundle;
        boolean zNextBoolean = true;
        int iZze = -1;
        int iNextInt = -1;
        int iNextInt2 = -1;
        int iNextInt3 = 0;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        boolean zNextBoolean8 = false;
        int iNextInt4 = 0;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        boolean zNextBoolean11 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        boolean zNextBoolean19 = false;
        int iNextInt6 = 0;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        boolean zNextBoolean22 = false;
        int iZza = 2;
        double dNextDouble = 0.0d;
        zzfjy zzfjyVar = null;
        zzccy zzccyVarZza = null;
        zzbyv zzbyvVarZza = null;
        com.google.android.gms.ads.internal.client.zzt zztVarZza = null;
        String strNextString = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVarZzb = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVarZzd = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String string = strNextString4;
        String strNextString5 = string;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        List listZzb13 = list3;
        List listZza = list4;
        List listZzb14 = list5;
        List listZza2 = list6;
        JSONObject jSONObjectZzd6 = jSONObject;
        int iZzc = 0;
        int iZzd = 0;
        zzcbp zzcbpVarZza = null;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_source_instance_name")) {
                        b = -1;
                    } else {
                        b = 59;
                    }
                    break;
                case -1980587809:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("debug_signals")) {
                        b = -1;
                    } else {
                        b = Ascii.f22493FS;
                    }
                    break;
                case -1965512151:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("omid_settings")) {
                        b = -1;
                    } else {
                        b = 41;
                    }
                    break;
                case -1964744830:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("offline_ad_config")) {
                        b = -1;
                    } else {
                        b = 80;
                    }
                    break;
                case -1871425831:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("recursive_server_response_data")) {
                        b = -1;
                    } else {
                        b = 69;
                    }
                    break;
                case -1843156475:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_consent")) {
                        b = -1;
                    } else {
                        b = 71;
                    }
                    break;
                case -1840512279:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("presentation_urls")) {
                        b = -1;
                    } else {
                        b = 82;
                    }
                    break;
                case -1828733410:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("network_ping_config")) {
                        b = -1;
                    } else {
                        b = 79;
                    }
                    break;
                case -1812055556:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("play_prewarm_options")) {
                        b = -1;
                    } else {
                        b = 49;
                    }
                    break;
                case -1785028569:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("parallel_key")) {
                        b = -1;
                    } else {
                        b = 73;
                    }
                    break;
                case -1776946669:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_source_name")) {
                        b = -1;
                    } else {
                        b = 57;
                    }
                    break;
                case -1662989631:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_interscroller")) {
                        b = -1;
                    } else {
                        b = 53;
                    }
                    break;
                case -1620552059:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("preload_sort_type")) {
                        b = -1;
                    } else {
                        b = 77;
                    }
                    break;
                case -1620470467:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("backend_query_id")) {
                        b = -1;
                    } else {
                        b = 47;
                    }
                    break;
                case -1550155393:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("nofill_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.f22490CR;
                    }
                    break;
                case -1440104884:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_custom_close_blocked")) {
                        b = -1;
                    } else {
                        b = 35;
                    }
                    break;
                case -1439500848:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("orientation")) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case -1428969291:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("enable_omid")) {
                        b = -1;
                    } else {
                        b = 39;
                    }
                    break;
                case -1406227629:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b = -1;
                    } else {
                        b = 67;
                    }
                    break;
                case -1403779768:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("showable_impression_type")) {
                        b = -1;
                    } else {
                        b = 44;
                    }
                    break;
                case -1375413093:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_cover")) {
                        b = -1;
                    } else {
                        b = 54;
                    }
                    break;
                case -1360811658:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_sizes")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -1306015996:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("adapters")) {
                        b = -1;
                    } else {
                        b = Ascii.DC4;
                    }
                    break;
                case -1303332046:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("test_mode_enabled")) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -1289032093:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("extras")) {
                        b = -1;
                    } else {
                        b = Ascii.f22494GS;
                    }
                    break;
                case -1240082064:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_event_value")) {
                        b = -1;
                    } else {
                        b = 51;
                    }
                    break;
                case -1234181075:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b = -1;
                    } else {
                        b = Ascii.f22498RS;
                    }
                    break;
                case -1168140544:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("presentation_error_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.f22500SO;
                    }
                    break;
                case -1152230954:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_type")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1146534047:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_scroll_aware")) {
                        b = -1;
                    } else {
                        b = 43;
                    }
                    break;
                case -1115838944:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("fill_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.f22492FF;
                    }
                    break;
                case -1081936678:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("allocation_id")) {
                        b = -1;
                    } else {
                        b = Ascii.NAK;
                    }
                    break;
                case -1078050970:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("video_complete_urls")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -1051269058:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("active_view")) {
                        b = -1;
                    } else {
                        b = Ascii.f22491EM;
                    }
                    break;
                case -982608540:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("valid_from_timestamp")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case -972056451:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_source_instance_id")) {
                        b = -1;
                    } else {
                        b = 60;
                    }
                    break;
                case -776859333:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("click_urls")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -652881372:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("on_device_storage_configs")) {
                        b = -1;
                    } else {
                        b = 84;
                    }
                    break;
                case -570101180:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("late_load_urls")) {
                        b = -1;
                    } else {
                        b = 74;
                    }
                    break;
                case -544216775:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("safe_browsing")) {
                        b = -1;
                    } else {
                        b = Ascii.SUB;
                    }
                    break;
                case -437057161:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("imp_urls")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -404433734:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("rtb_native_required_assets")) {
                        b = -1;
                    } else {
                        b = 62;
                    }
                    break;
                case -404326515:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("render_timeout_ms")) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case -397704715:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_close_time_ms")) {
                        b = -1;
                    } else {
                        b = 45;
                    }
                    break;
                case -388807511:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals(ShareConstants.STORY_DEEP_LINK_URL)) {
                        b = -1;
                    } else {
                        b = SignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case -369773488:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_close_button_enabled")) {
                        b = -1;
                    } else {
                        b = 50;
                    }
                    break;
                case -213449460:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b = -1;
                    } else {
                        b = 65;
                    }
                    break;
                case -213424028:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        b = -1;
                    } else {
                        b = 46;
                    }
                    break;
                case -180214626:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("native_required_asset_viewability")) {
                        b = -1;
                    } else {
                        b = 63;
                    }
                    break;
                case -154616268:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_offline_ad")) {
                        b = -1;
                    } else {
                        b = Base64.padSymbol;
                    }
                    break;
                case -29338502:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case 3107:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad")) {
                        b = -1;
                    } else {
                        b = Ascii.DC2;
                    }
                    break;
                case 3355:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("id")) {
                        b = -1;
                    } else {
                        b = Ascii.ETB;
                    }
                    break;
                case 3076010:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("data")) {
                        b = -1;
                    } else {
                        b = Ascii.SYN;
                    }
                    break;
                case 37109963:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals(SDKAnalyticsEvents.PARAMETER_REQUEST_ID)) {
                        b = -1;
                    } else {
                        b = 68;
                    }
                    break;
                case 63195984:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("render_test_label")) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 107433883:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("qdata")) {
                        b = -1;
                    } else {
                        b = Ascii.CAN;
                    }
                    break;
                case 230323073:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_load_urls")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 281223176:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_secondary_analytics_logging_enabled")) {
                        b = -1;
                    } else {
                        b = 87;
                    }
                    break;
                case 418392395:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_closable_area_disabled")) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 542250332:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("consent_form_action_identifier")) {
                        b = -1;
                    } else {
                        b = 72;
                    }
                    break;
                case 549176928:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b = -1;
                    } else {
                        b = Ascii.DLE;
                    }
                    break;
                case 597473788:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("debug_dialog_string")) {
                        b = -1;
                    } else {
                        b = Ascii.ESC;
                    }
                    break;
                case 639133141:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("response_info_extras_override")) {
                        b = -1;
                    } else {
                        b = 86;
                    }
                    break;
                case 754887508:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("container_sizes")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 791122864:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("impression_type")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 805095541:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("analytics_event_name_to_parameters_map")) {
                        b = -1;
                    } else {
                        b = 78;
                    }
                    break;
                case 1010584092:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("transaction_id")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1100650276:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("rewards")) {
                        b = -1;
                    } else {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 1141602460:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("adapter_response_info_key")) {
                        b = -1;
                    } else {
                        b = 56;
                    }
                    break;
                case 1186014765:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("cache_hit_urls")) {
                        b = -1;
                    } else {
                        b = 66;
                    }
                    break;
                case 1303622534:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("preload_sort_value")) {
                        b = -1;
                    } else {
                        b = 76;
                    }
                    break;
                case 1321720943:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b = -1;
                    } else {
                        b = Ascii.f22502US;
                    }
                    break;
                case 1422388341:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_collapsible")) {
                        b = -1;
                    } else {
                        b = 70;
                    }
                    break;
                case 1437255331:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        b = -1;
                    } else {
                        b = 58;
                    }
                    break;
                case 1556932485:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        b = -1;
                    } else {
                        b = 81;
                    }
                    break;
                case 1565514205:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("adapter_only_third_party_impression")) {
                        b = -1;
                    } else {
                        b = 85;
                    }
                    break;
                case 1637553475:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("bid_response")) {
                        b = -1;
                    } else {
                        b = 40;
                    }
                    break;
                case 1638957285:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("video_start_urls")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1686319423:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("ad_network_class_name")) {
                        b = -1;
                    } else {
                        b = 55;
                    }
                    break;
                case 1688341040:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("video_reward_urls")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1799285870:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("use_third_party_container_height")) {
                        b = -1;
                    } else {
                        b = 48;
                    }
                    break;
                case 1839650832:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("renderers")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1875425491:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b = -1;
                    } else {
                        b = 42;
                    }
                    break;
                case 2068142375:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("rule_line_external_id")) {
                        b = -1;
                    } else {
                        b = 52;
                    }
                    break;
                case 2072888499:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("manual_tracking_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.f22499SI;
                    }
                    break;
                case 2075506442:
                    list = listZzb10;
                    listZzb = list2;
                    if (!str.equals("render_serially")) {
                        b = -1;
                    } else {
                        b = 75;
                    }
                    break;
                case 2117205836:
                    listZzb = list2;
                    list = listZzb10;
                    if (!str.equals("flow_control")) {
                        b = -1;
                    } else {
                        b = 83;
                    }
                    break;
                default:
                    list = listZzb10;
                    listZzb = list2;
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    listZzb2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 1:
                    iZzc = zzc(jsonReader.nextString());
                    listZzb10 = list;
                    break;
                case 2:
                    listZzb3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 3:
                    listZzb4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 4:
                    listZzb5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 5:
                    iZzd = zzd(jsonReader.nextInt());
                    listZzb10 = list;
                    break;
                case 6:
                    listZzb6 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 7:
                    listZzb7 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 8:
                    listZzb8 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 9:
                    strNextString20 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 10:
                    strNextString19 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 11:
                    zzcbpVarZza = zzcbp.zza(com.google.android.gms.ads.internal.util.zzbp.zze(jsonReader));
                    listZzb10 = list;
                    break;
                case 12:
                    listZzb9 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 13:
                    listZzb10 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    break;
                case 14:
                    listZzb = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 15:
                    listZzb13 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 16:
                    iNextInt3 = jsonReader.nextInt();
                    listZzb10 = list;
                    break;
                case 17:
                    listZza = zzfju.zza(jsonReader);
                    listZzb10 = list;
                    break;
                case 18:
                    zzfjyVar = new zzfjy(jsonReader);
                    listZzb10 = list;
                    break;
                case 19:
                    listZza2 = zzfju.zza(jsonReader);
                    listZzb10 = list;
                    break;
                case 20:
                    listZzb14 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 21:
                    strNextString2 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 22:
                    jSONObjectZzd6 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb10 = list;
                    break;
                case 23:
                    strNextString3 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 24:
                    strNextString4 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader).toString();
                    listZzb10 = list;
                    break;
                case 26:
                    zzccyVarZza = zzccy.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listZzb10 = list;
                    break;
                case 27:
                    strNextString5 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 28:
                    jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb10 = list;
                    break;
                case 29:
                    jSONObjectZzd2 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb10 = list;
                    break;
                case 30:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 31:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 32:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 33:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 34:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 35:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 36:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 37:
                    iZze = zze(jsonReader.nextString());
                    listZzb10 = list;
                    break;
                case 38:
                    iNextInt4 = jsonReader.nextInt();
                    listZzb10 = list;
                    break;
                case 39:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 40:
                    strNextString6 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 41:
                    jSONObjectZzd3 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb10 = list;
                    break;
                case 42:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 43:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 44:
                    iNextInt5 = jsonReader.nextInt();
                    listZzb10 = list;
                    break;
                case 45:
                    iNextInt = jsonReader.nextInt();
                    listZzb10 = list;
                    break;
                case 46:
                    strNextString7 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 47:
                    strNextString8 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 48:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 49:
                    zzbyvVarZza = zzbyv.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listZzb10 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 51:
                    zztVarZza = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listZzb10 = list;
                    break;
                case 52:
                    strNextString9 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 53:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 54:
                    jSONObjectZzd4 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb10 = list;
                    break;
                case 55:
                    strNextString10 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 56:
                    strNextString17 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 57:
                    strNextString11 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 58:
                    strNextString12 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 59:
                    strNextString13 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 60:
                    strNextString14 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 61:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 62:
                    jSONObjectZzd5 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb10 = list;
                    break;
                case 63:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 64:
                    strNextString = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 65:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 66:
                    com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 67:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 68:
                    strNextString15 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 69:
                    strNextString16 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case 70:
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 71:
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                    iNextInt6 = jsonReader.nextInt();
                    listZzb10 = list;
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    strNextString18 = jsonReader.nextString();
                    listZzb10 = list;
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    listZzb11 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    zNextBoolean20 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 76:
                    dNextDouble = jsonReader.nextDouble();
                    listZzb10 = list;
                    break;
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                    iZza = zzfsx.zza(jsonReader.nextInt());
                    listZzb10 = list;
                    break;
                case 78:
                    if (((Boolean) zzbie.zzaP.zzg()).booleanValue()) {
                        mapZzc = com.google.android.gms.ads.internal.util.zzbp.zzc(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb10 = list;
                    break;
                case 79:
                    if (((Boolean) zzbie.zzjN.zzg()).booleanValue()) {
                        zzvVarZzb = com.google.android.gms.ads.internal.util.client.zzv.zzb(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb10 = list;
                    break;
                case 80:
                    if (((Boolean) zzbie.zzjP.zzg()).booleanValue()) {
                        zzwVarZzd = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb10 = list;
                    break;
                case 81:
                    if (((Boolean) zzbie.zzon.zzg()).booleanValue()) {
                        iNextInt2 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb10 = list;
                    break;
                case 82:
                    listZzb12 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb10 = list;
                    break;
                case 83:
                    zNextBoolean21 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 84:
                    if (((Boolean) zzbie.zziK.zzg()).booleanValue()) {
                        zzgvzVarZza = zzead.zza(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb10 = list;
                    break;
                case 85:
                    zNextBoolean22 = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                case 86:
                    if (((Boolean) zzbie.zzhL.zzg()).booleanValue()) {
                        try {
                            Bundle bundleZzl = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                            if (bundleZzl != null) {
                                bundle2 = bundleZzl;
                            }
                        } catch (IllegalStateException unused) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb10 = list;
                    break;
                case 87:
                    zNextBoolean = jsonReader.nextBoolean();
                    listZzb10 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listZzb10 = list;
                    break;
            }
            list2 = listZzb;
        }
        jsonReader.endObject();
        this.zza = listZzb2;
        this.zzb = iZzc;
        this.zzc = listZzb3;
        this.zzd = listZzb4;
        this.zzf = listZzb5;
        this.zze = iZzd;
        this.zzg = listZzb6;
        this.zzh = listZzb7;
        this.zzi = listZzb8;
        this.zzj = strNextString20;
        this.zzk = strNextString19;
        this.zzl = zzcbpVarZza;
        this.zzm = listZzb9;
        this.zzn = listZzb10;
        this.zzo = list2;
        this.zzp = listZzb13;
        this.zzq = iNextInt3;
        this.zzr = listZza;
        this.zzs = zzfjyVar;
        this.zzt = listZzb14;
        this.zzu = listZza2;
        this.zzw = strNextString2;
        this.zzv = jSONObjectZzd6;
        this.zzx = strNextString3;
        this.zzy = strNextString4;
        this.zzz = string;
        this.zzA = zzccyVarZza;
        this.zzB = strNextString5;
        this.zzC = jSONObjectZzd;
        this.zzD = jSONObjectZzd2;
        this.zzJ = zNextBoolean2;
        this.zzK = zNextBoolean3;
        this.zzL = zNextBoolean4;
        this.zzM = zNextBoolean5;
        this.zzN = zNextBoolean6;
        this.zzO = zNextBoolean7;
        this.zzP = zNextBoolean8;
        this.zzQ = iZze;
        this.zzR = iNextInt4;
        this.zzT = zNextBoolean9;
        this.zzU = strNextString6;
        this.zzV = new zzfkp(jSONObjectZzd3);
        this.zzW = zNextBoolean10;
        this.zzX = zNextBoolean11;
        this.zzY = iNextInt5;
        this.zzZ = strNextString7;
        this.zzaa = iNextInt;
        this.zzab = strNextString8;
        this.zzac = zNextBoolean12;
        this.zzad = zzbyvVarZza;
        this.zzae = zztVarZza;
        this.zzaf = strNextString9;
        this.zzag = zNextBoolean13;
        this.zzah = jSONObjectZzd4;
        this.zzE = strNextString10;
        this.zzF = strNextString11;
        this.zzG = strNextString12;
        this.zzH = strNextString13;
        this.zzI = strNextString14;
        this.zzai = zNextBoolean14;
        this.zzaj = jSONObjectZzd5;
        this.zzak = zNextBoolean15;
        this.zzal = strNextString;
        this.zzam = zNextBoolean16;
        this.zzS = zNextBoolean17;
        this.zzan = strNextString15;
        this.zzao = strNextString16;
        this.zzap = strNextString17;
        this.zzaq = zNextBoolean18;
        this.zzar = zNextBoolean19;
        this.zzas = iNextInt6;
        this.zzau = listZzb11;
        this.zzat = strNextString18;
        this.zzav = zNextBoolean20;
        this.zzaw = mapZzc;
        this.zzax = zzvVarZzb;
        this.zzay = zzwVarZzd;
        this.zzaz = dNextDouble;
        this.zzaH = iZza;
        this.zzaA = listZzb12;
        this.zzaB = zNextBoolean21;
        this.zzaC = zzgvzVarZza;
        this.zzaD = zNextBoolean22;
        this.zzaE = iNextInt2;
        this.zzaF = bundle2;
        this.zzaG = zNextBoolean;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return C12357j.f31263a;
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4) {
            return i;
        }
        return 0;
    }

    private static int zze(String str) {
        if (C11744X3.i.f26320C.equalsIgnoreCase(str)) {
            return 6;
        }
        return C11744X3.i.f26322D.equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
