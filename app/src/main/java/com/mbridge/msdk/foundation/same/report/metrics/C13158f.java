package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.gadsme.nativeplugin.BuildConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13089b;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13826m;
import com.mbridge.msdk.tracker.network.toolbox.C13859i;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.metrics.f */
/* JADX INFO: compiled from: SameMetricsReport.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13158f {
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:310:0x0840  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: Exception -> 0x083b, TryCatch #0 {Exception -> 0x083b, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:38:0x00a6, B:40:0x00ac, B:47:0x00c8, B:49:0x00ce, B:51:0x00d3, B:54:0x00f6, B:56:0x00fc, B:63:0x012b, B:65:0x012f, B:66:0x0132, B:67:0x0136, B:69:0x013c, B:72:0x0145, B:74:0x018e, B:76:0x01ed, B:78:0x01f7, B:80:0x020a, B:81:0x0213, B:83:0x0226, B:85:0x0235, B:86:0x0242, B:89:0x024e, B:92:0x027d, B:94:0x0283, B:96:0x0289, B:97:0x02a7, B:98:0x02b2, B:100:0x02bc, B:102:0x02c2, B:105:0x02f2, B:107:0x02fa, B:109:0x0300, B:110:0x031e, B:111:0x0329, B:113:0x0331, B:115:0x0337, B:116:0x0355, B:117:0x0360, B:119:0x0368, B:121:0x036e, B:122:0x038c, B:123:0x0397, B:126:0x03ac, B:128:0x03b6, B:129:0x03bc, B:130:0x03c1, B:132:0x03c7, B:134:0x03d5, B:137:0x03e5, B:139:0x03eb, B:146:0x0433, B:148:0x043d, B:151:0x0449, B:153:0x044f, B:154:0x0468, B:155:0x046c, B:157:0x0472, B:158:0x048b, B:159:0x048e, B:161:0x0498, B:163:0x04a7, B:164:0x04c7, B:165:0x04d0, B:168:0x04da, B:170:0x04e0, B:176:0x051f, B:180:0x052b, B:182:0x0541, B:184:0x0566, B:186:0x056e, B:188:0x0593, B:190:0x0597, B:192:0x05a7, B:193:0x05ac, B:195:0x05b6, B:196:0x05bf, B:198:0x05c5, B:199:0x05d2, B:201:0x05f0, B:203:0x05f7, B:204:0x0604, B:206:0x060e, B:207:0x0617, B:209:0x061f, B:211:0x0626, B:212:0x0633, B:214:0x063d, B:215:0x0646, B:216:0x0653, B:218:0x065b, B:223:0x0669, B:226:0x0677, B:228:0x069d, B:230:0x06a3, B:232:0x06a8, B:231:0x06a6, B:233:0x06af, B:235:0x06b7, B:237:0x06bd, B:239:0x06c2, B:238:0x06c0, B:240:0x06c9, B:243:0x06d3, B:245:0x06db, B:246:0x06e3, B:248:0x06f1, B:250:0x06f7, B:252:0x06fc, B:254:0x070b, B:256:0x0711, B:258:0x0716, B:262:0x0728, B:266:0x0748, B:268:0x0751, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:269:0x075d, B:265:0x0744, B:257:0x0714, B:251:0x06fa, B:187:0x058c, B:183:0x055f, B:171:0x04f9, B:172:0x04fd, B:174:0x0503, B:175:0x051c, B:140:0x0406, B:141:0x040c, B:143:0x0414, B:144:0x042d, B:103:0x02e2, B:90:0x026e, B:82:0x021d, B:75:0x01ce, B:41:0x00b4, B:43:0x00ba, B:46:0x00c5, B:44:0x00bf, B:19:0x0060, B:23:0x0074, B:26:0x007d, B:28:0x0083, B:31:0x008e, B:33:0x0094, B:29:0x0088, B:35:0x009a, B:18:0x0057, B:58:0x010a, B:60:0x0125, B:11:0x0041, B:13:0x0047), top: B:313:0x001d, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: Exception -> 0x083b, TryCatch #0 {Exception -> 0x083b, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:38:0x00a6, B:40:0x00ac, B:47:0x00c8, B:49:0x00ce, B:51:0x00d3, B:54:0x00f6, B:56:0x00fc, B:63:0x012b, B:65:0x012f, B:66:0x0132, B:67:0x0136, B:69:0x013c, B:72:0x0145, B:74:0x018e, B:76:0x01ed, B:78:0x01f7, B:80:0x020a, B:81:0x0213, B:83:0x0226, B:85:0x0235, B:86:0x0242, B:89:0x024e, B:92:0x027d, B:94:0x0283, B:96:0x0289, B:97:0x02a7, B:98:0x02b2, B:100:0x02bc, B:102:0x02c2, B:105:0x02f2, B:107:0x02fa, B:109:0x0300, B:110:0x031e, B:111:0x0329, B:113:0x0331, B:115:0x0337, B:116:0x0355, B:117:0x0360, B:119:0x0368, B:121:0x036e, B:122:0x038c, B:123:0x0397, B:126:0x03ac, B:128:0x03b6, B:129:0x03bc, B:130:0x03c1, B:132:0x03c7, B:134:0x03d5, B:137:0x03e5, B:139:0x03eb, B:146:0x0433, B:148:0x043d, B:151:0x0449, B:153:0x044f, B:154:0x0468, B:155:0x046c, B:157:0x0472, B:158:0x048b, B:159:0x048e, B:161:0x0498, B:163:0x04a7, B:164:0x04c7, B:165:0x04d0, B:168:0x04da, B:170:0x04e0, B:176:0x051f, B:180:0x052b, B:182:0x0541, B:184:0x0566, B:186:0x056e, B:188:0x0593, B:190:0x0597, B:192:0x05a7, B:193:0x05ac, B:195:0x05b6, B:196:0x05bf, B:198:0x05c5, B:199:0x05d2, B:201:0x05f0, B:203:0x05f7, B:204:0x0604, B:206:0x060e, B:207:0x0617, B:209:0x061f, B:211:0x0626, B:212:0x0633, B:214:0x063d, B:215:0x0646, B:216:0x0653, B:218:0x065b, B:223:0x0669, B:226:0x0677, B:228:0x069d, B:230:0x06a3, B:232:0x06a8, B:231:0x06a6, B:233:0x06af, B:235:0x06b7, B:237:0x06bd, B:239:0x06c2, B:238:0x06c0, B:240:0x06c9, B:243:0x06d3, B:245:0x06db, B:246:0x06e3, B:248:0x06f1, B:250:0x06f7, B:252:0x06fc, B:254:0x070b, B:256:0x0711, B:258:0x0716, B:262:0x0728, B:266:0x0748, B:268:0x0751, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:269:0x075d, B:265:0x0744, B:257:0x0714, B:251:0x06fa, B:187:0x058c, B:183:0x055f, B:171:0x04f9, B:172:0x04fd, B:174:0x0503, B:175:0x051c, B:140:0x0406, B:141:0x040c, B:143:0x0414, B:144:0x042d, B:103:0x02e2, B:90:0x026e, B:82:0x021d, B:75:0x01ce, B:41:0x00b4, B:43:0x00ba, B:46:0x00c5, B:44:0x00bf, B:19:0x0060, B:23:0x0074, B:26:0x007d, B:28:0x0083, B:31:0x008e, B:33:0x0094, B:29:0x0088, B:35:0x009a, B:18:0x0057, B:58:0x010a, B:60:0x0125, B:11:0x0041, B:13:0x0047), top: B:313:0x001d, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[Catch: Exception -> 0x083b, TryCatch #0 {Exception -> 0x083b, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:38:0x00a6, B:40:0x00ac, B:47:0x00c8, B:49:0x00ce, B:51:0x00d3, B:54:0x00f6, B:56:0x00fc, B:63:0x012b, B:65:0x012f, B:66:0x0132, B:67:0x0136, B:69:0x013c, B:72:0x0145, B:74:0x018e, B:76:0x01ed, B:78:0x01f7, B:80:0x020a, B:81:0x0213, B:83:0x0226, B:85:0x0235, B:86:0x0242, B:89:0x024e, B:92:0x027d, B:94:0x0283, B:96:0x0289, B:97:0x02a7, B:98:0x02b2, B:100:0x02bc, B:102:0x02c2, B:105:0x02f2, B:107:0x02fa, B:109:0x0300, B:110:0x031e, B:111:0x0329, B:113:0x0331, B:115:0x0337, B:116:0x0355, B:117:0x0360, B:119:0x0368, B:121:0x036e, B:122:0x038c, B:123:0x0397, B:126:0x03ac, B:128:0x03b6, B:129:0x03bc, B:130:0x03c1, B:132:0x03c7, B:134:0x03d5, B:137:0x03e5, B:139:0x03eb, B:146:0x0433, B:148:0x043d, B:151:0x0449, B:153:0x044f, B:154:0x0468, B:155:0x046c, B:157:0x0472, B:158:0x048b, B:159:0x048e, B:161:0x0498, B:163:0x04a7, B:164:0x04c7, B:165:0x04d0, B:168:0x04da, B:170:0x04e0, B:176:0x051f, B:180:0x052b, B:182:0x0541, B:184:0x0566, B:186:0x056e, B:188:0x0593, B:190:0x0597, B:192:0x05a7, B:193:0x05ac, B:195:0x05b6, B:196:0x05bf, B:198:0x05c5, B:199:0x05d2, B:201:0x05f0, B:203:0x05f7, B:204:0x0604, B:206:0x060e, B:207:0x0617, B:209:0x061f, B:211:0x0626, B:212:0x0633, B:214:0x063d, B:215:0x0646, B:216:0x0653, B:218:0x065b, B:223:0x0669, B:226:0x0677, B:228:0x069d, B:230:0x06a3, B:232:0x06a8, B:231:0x06a6, B:233:0x06af, B:235:0x06b7, B:237:0x06bd, B:239:0x06c2, B:238:0x06c0, B:240:0x06c9, B:243:0x06d3, B:245:0x06db, B:246:0x06e3, B:248:0x06f1, B:250:0x06f7, B:252:0x06fc, B:254:0x070b, B:256:0x0711, B:258:0x0716, B:262:0x0728, B:266:0x0748, B:268:0x0751, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:269:0x075d, B:265:0x0744, B:257:0x0714, B:251:0x06fa, B:187:0x058c, B:183:0x055f, B:171:0x04f9, B:172:0x04fd, B:174:0x0503, B:175:0x051c, B:140:0x0406, B:141:0x040c, B:143:0x0414, B:144:0x042d, B:103:0x02e2, B:90:0x026e, B:82:0x021d, B:75:0x01ce, B:41:0x00b4, B:43:0x00ba, B:46:0x00c5, B:44:0x00bf, B:19:0x0060, B:23:0x0074, B:26:0x007d, B:28:0x0083, B:31:0x008e, B:33:0x0094, B:29:0x0088, B:35:0x009a, B:18:0x0057, B:58:0x010a, B:60:0x0125, B:11:0x0041, B:13:0x0047), top: B:313:0x001d, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[Catch: Exception -> 0x083b, TryCatch #0 {Exception -> 0x083b, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:38:0x00a6, B:40:0x00ac, B:47:0x00c8, B:49:0x00ce, B:51:0x00d3, B:54:0x00f6, B:56:0x00fc, B:63:0x012b, B:65:0x012f, B:66:0x0132, B:67:0x0136, B:69:0x013c, B:72:0x0145, B:74:0x018e, B:76:0x01ed, B:78:0x01f7, B:80:0x020a, B:81:0x0213, B:83:0x0226, B:85:0x0235, B:86:0x0242, B:89:0x024e, B:92:0x027d, B:94:0x0283, B:96:0x0289, B:97:0x02a7, B:98:0x02b2, B:100:0x02bc, B:102:0x02c2, B:105:0x02f2, B:107:0x02fa, B:109:0x0300, B:110:0x031e, B:111:0x0329, B:113:0x0331, B:115:0x0337, B:116:0x0355, B:117:0x0360, B:119:0x0368, B:121:0x036e, B:122:0x038c, B:123:0x0397, B:126:0x03ac, B:128:0x03b6, B:129:0x03bc, B:130:0x03c1, B:132:0x03c7, B:134:0x03d5, B:137:0x03e5, B:139:0x03eb, B:146:0x0433, B:148:0x043d, B:151:0x0449, B:153:0x044f, B:154:0x0468, B:155:0x046c, B:157:0x0472, B:158:0x048b, B:159:0x048e, B:161:0x0498, B:163:0x04a7, B:164:0x04c7, B:165:0x04d0, B:168:0x04da, B:170:0x04e0, B:176:0x051f, B:180:0x052b, B:182:0x0541, B:184:0x0566, B:186:0x056e, B:188:0x0593, B:190:0x0597, B:192:0x05a7, B:193:0x05ac, B:195:0x05b6, B:196:0x05bf, B:198:0x05c5, B:199:0x05d2, B:201:0x05f0, B:203:0x05f7, B:204:0x0604, B:206:0x060e, B:207:0x0617, B:209:0x061f, B:211:0x0626, B:212:0x0633, B:214:0x063d, B:215:0x0646, B:216:0x0653, B:218:0x065b, B:223:0x0669, B:226:0x0677, B:228:0x069d, B:230:0x06a3, B:232:0x06a8, B:231:0x06a6, B:233:0x06af, B:235:0x06b7, B:237:0x06bd, B:239:0x06c2, B:238:0x06c0, B:240:0x06c9, B:243:0x06d3, B:245:0x06db, B:246:0x06e3, B:248:0x06f1, B:250:0x06f7, B:252:0x06fc, B:254:0x070b, B:256:0x0711, B:258:0x0716, B:262:0x0728, B:266:0x0748, B:268:0x0751, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:269:0x075d, B:265:0x0744, B:257:0x0714, B:251:0x06fa, B:187:0x058c, B:183:0x055f, B:171:0x04f9, B:172:0x04fd, B:174:0x0503, B:175:0x051c, B:140:0x0406, B:141:0x040c, B:143:0x0414, B:144:0x042d, B:103:0x02e2, B:90:0x026e, B:82:0x021d, B:75:0x01ce, B:41:0x00b4, B:43:0x00ba, B:46:0x00c5, B:44:0x00bf, B:19:0x0060, B:23:0x0074, B:26:0x007d, B:28:0x0083, B:31:0x008e, B:33:0x0094, B:29:0x0088, B:35:0x009a, B:18:0x0057, B:58:0x010a, B:60:0x0125, B:11:0x0041, B:13:0x0047), top: B:313:0x001d, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: Exception -> 0x083b, TryCatch #0 {Exception -> 0x083b, blocks: (B:3:0x001d, B:5:0x0029, B:8:0x0030, B:10:0x003c, B:38:0x00a6, B:40:0x00ac, B:47:0x00c8, B:49:0x00ce, B:51:0x00d3, B:54:0x00f6, B:56:0x00fc, B:63:0x012b, B:65:0x012f, B:66:0x0132, B:67:0x0136, B:69:0x013c, B:72:0x0145, B:74:0x018e, B:76:0x01ed, B:78:0x01f7, B:80:0x020a, B:81:0x0213, B:83:0x0226, B:85:0x0235, B:86:0x0242, B:89:0x024e, B:92:0x027d, B:94:0x0283, B:96:0x0289, B:97:0x02a7, B:98:0x02b2, B:100:0x02bc, B:102:0x02c2, B:105:0x02f2, B:107:0x02fa, B:109:0x0300, B:110:0x031e, B:111:0x0329, B:113:0x0331, B:115:0x0337, B:116:0x0355, B:117:0x0360, B:119:0x0368, B:121:0x036e, B:122:0x038c, B:123:0x0397, B:126:0x03ac, B:128:0x03b6, B:129:0x03bc, B:130:0x03c1, B:132:0x03c7, B:134:0x03d5, B:137:0x03e5, B:139:0x03eb, B:146:0x0433, B:148:0x043d, B:151:0x0449, B:153:0x044f, B:154:0x0468, B:155:0x046c, B:157:0x0472, B:158:0x048b, B:159:0x048e, B:161:0x0498, B:163:0x04a7, B:164:0x04c7, B:165:0x04d0, B:168:0x04da, B:170:0x04e0, B:176:0x051f, B:180:0x052b, B:182:0x0541, B:184:0x0566, B:186:0x056e, B:188:0x0593, B:190:0x0597, B:192:0x05a7, B:193:0x05ac, B:195:0x05b6, B:196:0x05bf, B:198:0x05c5, B:199:0x05d2, B:201:0x05f0, B:203:0x05f7, B:204:0x0604, B:206:0x060e, B:207:0x0617, B:209:0x061f, B:211:0x0626, B:212:0x0633, B:214:0x063d, B:215:0x0646, B:216:0x0653, B:218:0x065b, B:223:0x0669, B:226:0x0677, B:228:0x069d, B:230:0x06a3, B:232:0x06a8, B:231:0x06a6, B:233:0x06af, B:235:0x06b7, B:237:0x06bd, B:239:0x06c2, B:238:0x06c0, B:240:0x06c9, B:243:0x06d3, B:245:0x06db, B:246:0x06e3, B:248:0x06f1, B:250:0x06f7, B:252:0x06fc, B:254:0x070b, B:256:0x0711, B:258:0x0716, B:262:0x0728, B:266:0x0748, B:268:0x0751, B:271:0x076d, B:273:0x0779, B:279:0x0788, B:281:0x0794, B:283:0x079e, B:289:0x07b5, B:291:0x07c8, B:293:0x07ce, B:295:0x07d3, B:294:0x07d1, B:290:0x07bf, B:284:0x07a7, B:286:0x07ad, B:305:0x080e, B:296:0x07db, B:298:0x07e9, B:300:0x07fc, B:302:0x0802, B:304:0x0807, B:303:0x0805, B:299:0x07f3, B:269:0x075d, B:265:0x0744, B:257:0x0714, B:251:0x06fa, B:187:0x058c, B:183:0x055f, B:171:0x04f9, B:172:0x04fd, B:174:0x0503, B:175:0x051c, B:140:0x0406, B:141:0x040c, B:143:0x0414, B:144:0x042d, B:103:0x02e2, B:90:0x026e, B:82:0x021d, B:75:0x01ce, B:41:0x00b4, B:43:0x00ba, B:46:0x00c5, B:44:0x00bf, B:19:0x0060, B:23:0x0074, B:26:0x007d, B:28:0x0083, B:31:0x008e, B:33:0x0094, B:29:0x0088, B:35:0x009a, B:18:0x0057, B:58:0x010a, B:60:0x0125, B:11:0x0041, B:13:0x0047), top: B:313:0x001d, inners: #1, #2 }] */
    /* JADX INFO: renamed from: c */
    private Map<String, String> m37509c(String str, C13154c c13154c) {
        int i;
        String str2;
        String str3;
        List<CampaignEx> listM37453m;
        String str4 = str;
        String str5 = "rid_n";
        String str6 = CampaignEx.JSON_KEY_EC_TEMP_ID;
        C13157e c13157e = new C13157e();
        try {
            if (Arrays.asList(C13153b.f36143g).contains(str4)) {
                return c13157e.m37499a();
            }
            if (c13154c == null) {
                c13157e.m37501a("metrics_data_reason", "metrics 上报时意外为空");
                return c13157e.m37499a();
            }
            List arrayList = new ArrayList();
            try {
                if (c13154c.m37455n() == null || c13154c.m37455n().getAdType() != 295) {
                    if (Arrays.asList(C13153b.f36142f).contains(str4)) {
                        try {
                            if ("m_download_start".equals(str4) || "m_download_end".equals(str4)) {
                                arrayList = m37507a(c13154c, str4);
                            } else {
                                List<CampaignEx> listM37457o = c13154c.m37457o() != null ? c13154c.m37457o() : c13154c.m37453m();
                                if (listM37457o != null && listM37457o.size() > 0) {
                                    arrayList.addAll(listM37457o);
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                        }
                    } else if (c13154c.m37455n() != null) {
                        arrayList.add(c13154c.m37455n());
                    } else {
                        if (c13154c.m37457o() != null) {
                            listM37453m = c13154c.m37457o();
                        } else {
                            listM37453m = c13154c.m37453m();
                        }
                        if (listM37453m != null) {
                            arrayList.addAll(listM37453m);
                        }
                    }
                } else if (c13154c.m37455n() != null) {
                    arrayList.add(c13154c.m37455n());
                } else {
                    if (c13154c.m37457o() != null) {
                        listM37453m = c13154c.m37457o();
                    } else {
                        listM37453m = c13154c.m37453m();
                    }
                    if (listM37453m != null) {
                        arrayList.addAll(listM37453m);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37816b("SameMetricsReport", th.getMessage());
            }
            if (arrayList.isEmpty()) {
                return c13157e.m37499a();
            }
            Map<String, Map<String, String>> mapM37466w = c13154c.m37466w();
            StringBuilder sb = new StringBuilder();
            List<CampaignEx> list = arrayList;
            sb.append(c13154c.m37463t());
            sb.append(str4);
            String string = sb.toString();
            if (mapM37466w.containsKey(string) && mapM37466w.get(string) != null && mapM37466w.get(string).containsKey("126_exclude")) {
                try {
                    String str7 = mapM37466w.get(string).get("126_exclude");
                    mapM37466w.get(string).remove("126_exclude");
                    if ("1".equals(str7)) {
                        return c13157e.m37499a();
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null) {
                    c13157e.m37501a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                    c13157e.m37501a("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                    c13157e.m37501a("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                    c13157e.m37501a(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                    c13157e.m37501a(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                    ArrayList<Integer> rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                    if (rsIgnoreCheckRule != null) {
                        i = 1;
                        c13157e.m37501a("ignore_video", Integer.valueOf(!rsIgnoreCheckRule.contains(0) ? 1 : 0));
                        c13157e.m37501a("ignore_template", Integer.valueOf(!rsIgnoreCheckRule.contains(1) ? 1 : 0));
                        c13157e.m37501a("ignore_ec", Integer.valueOf(!rsIgnoreCheckRule.contains(2) ? 1 : 0));
                    } else {
                        i = 1;
                        c13157e.m37501a("ignore_video", 1);
                        c13157e.m37501a("ignore_template", 1);
                        c13157e.m37501a("ignore_ec", 1);
                    }
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        c13157e.m37501a("lrid", campaignEx.getLocalRequestId());
                    } else {
                        c13157e.m37501a("n_lrid", campaignEx.getNLRid());
                        if (!TextUtils.isEmpty(campaignEx.getNRid())) {
                            c13157e.m37501a("n_rid", campaignEx.getNRid());
                        }
                        c13157e.m37501a("lrid", campaignEx.getLocalRequestId());
                    }
                    c13157e.m37501a("rid", campaignEx.getRequestId());
                    if (campaignEx.getMof_tplid() != 0) {
                        c13157e.m37501a("stid", Integer.valueOf(campaignEx.getMof_tplid()));
                    }
                    CampaignEx.C13066c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (c13157e.m37503a(CampaignEx.KEY_LOCAL_CHECK_STATE)) {
                        c13157e.m37501a(CampaignEx.KEY_LOCAL_CHECK_STATE, c13157e.m37504b(CampaignEx.KEY_LOCAL_CHECK_STATE) + "," + campaignEx.getLocalCheckShow());
                    } else {
                        c13157e.m37501a(CampaignEx.KEY_LOCAL_CHECK_STATE, Integer.valueOf(campaignEx.getLocalCheckShow()));
                    }
                    if (rewardTemplateMode != 0 && rewardTemplateMode.m36782k() != 0) {
                        if (c13157e.m37503a("vtid")) {
                            c13157e.m37501a("vtid", c13157e.m37504b("vtid") + "," + rewardTemplateMode.m36782k());
                        } else {
                            c13157e.m37501a("vtid", Integer.valueOf(rewardTemplateMode.m36782k()));
                        }
                    }
                    if (campaignEx.getCreativeId() != 0) {
                        if (c13157e.m37503a("crid")) {
                            c13157e.m37501a("crid", c13157e.m37504b("crid") + "," + campaignEx.getCreativeId());
                        } else {
                            c13157e.m37501a("crid", Long.valueOf(campaignEx.getCreativeId()));
                        }
                    }
                    if (campaignEx.getVidCrtvId() != 0) {
                        if (c13157e.m37503a("video_crid")) {
                            c13157e.m37501a("video_crid", c13157e.m37504b("video_crid") + "," + campaignEx.getVidCrtvId());
                        } else {
                            c13157e.m37501a("video_crid", Long.valueOf(campaignEx.getVidCrtvId()));
                        }
                    }
                    if (campaignEx.getEcCrtvId() != 0) {
                        if (c13157e.m37503a("endcard_crid")) {
                            c13157e.m37501a("endcard_crid", c13157e.m37504b("endcard_crid") + "," + campaignEx.getEcCrtvId());
                        } else {
                            c13157e.m37501a("endcard_crid", Long.valueOf(campaignEx.getEcCrtvId()));
                        }
                    }
                    if (campaignEx.getEcTemplateId() != 0) {
                        if (c13157e.m37503a(str6)) {
                            c13157e.m37501a(str6, c13157e.m37504b(str6) + "," + campaignEx.getEcTemplateId());
                        } else {
                            c13157e.m37501a(str6, Long.valueOf(campaignEx.getEcTemplateId()));
                        }
                    }
                    c13157e.m37501a("bid_tk", campaignEx.getBidToken());
                    if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                        if (C13229v0.m37938i(campaignEx.getMof_template_url())) {
                            c13157e.m37501a("sdyv", "1");
                        } else {
                            c13157e.m37501a("sdyv", "2");
                        }
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                        str2 = str6;
                    } else if (!C13229v0.m37938i(campaignEx.getRewardTemplateMode().m36781j())) {
                        str2 = str6;
                        if (c13157e.m37503a("vdyv")) {
                            c13157e.m37501a("vdyv", c13157e.m37504b("vdyv") + ",2");
                        } else {
                            c13157e.m37501a("vdyv", "2");
                        }
                    } else if (c13157e.m37503a("vdyv")) {
                        StringBuilder sb2 = new StringBuilder();
                        str2 = str6;
                        sb2.append(c13157e.m37504b("vdyv"));
                        sb2.append(",1");
                        c13157e.m37501a("vdyv", sb2.toString());
                    } else {
                        str2 = str6;
                        c13157e.m37501a("vdyv", "1");
                    }
                    if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                        if (C13229v0.m37938i(campaignEx.getendcard_url())) {
                            if (c13157e.m37503a("edyv")) {
                                c13157e.m37501a("edyv", c13157e.m37504b("edyv") + ",1");
                            } else {
                                c13157e.m37501a("edyv", "1");
                            }
                        } else if (c13157e.m37503a("edyv")) {
                            c13157e.m37501a("edyv", c13157e.m37504b("edyv") + ",2");
                        } else {
                            c13157e.m37501a("edyv", "2");
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getExt_data())) {
                        JSONObject jSONObject = new JSONObject(campaignEx.getExt_data());
                        if (c13157e.m37503a("dspid")) {
                            c13157e.m37501a("dspid", c13157e.m37504b("dspid") + "," + jSONObject.optString("par_dspid"));
                        } else {
                            c13157e.m37501a("dspid", jSONObject.optString("par_dspid"));
                        }
                    }
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        if (c13157e.m37503a("only_ec")) {
                            c13157e.m37501a("only_ec", c13157e.m37504b("only_ec") + ",2");
                        } else {
                            c13157e.m37501a("only_ec", "2");
                        }
                    } else if (c13157e.m37503a("only_ec")) {
                        c13157e.m37501a("only_ec", c13157e.m37504b("only_ec") + ",1");
                    } else {
                        c13157e.m37501a("only_ec", "1");
                    }
                    c13157e.m37501a(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? "1" : "0");
                    c13157e.m37501a(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                    if (c13157e.m37503a("cid")) {
                        c13157e.m37501a("cid", c13157e.m37504b("cid") + "," + campaignEx.getId());
                    } else {
                        c13157e.m37501a("cid", campaignEx.getId());
                    }
                    String str8 = str5;
                    if (c13157e.m37503a(str8)) {
                        c13157e.m37501a(str8, c13157e.m37504b(str8) + "," + campaignEx.getRequestIdNotice());
                    } else {
                        c13157e.m37501a(str8, campaignEx.getRequestIdNotice());
                    }
                    HashMap<String, String> map = AbstractC13003a.f35476r;
                    if (map != null) {
                        String str9 = map.get(campaignEx.getCampaignUnitId());
                        if (!TextUtils.isEmpty(str9)) {
                            c13157e.m37501a("u_stid", str9);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                        c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                    }
                    if (campaignEx.getAdType() != 0) {
                        c13157e.m37501a("adtp", Integer.valueOf(campaignEx.getAdType()));
                    }
                    c13157e.m37501a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                    c13157e.m37501a(CampaignEx.URL_KEY_EXP_IDS, campaignEx.getExpIds());
                    if ("2000047".contains(str4)) {
                        if (campaignEx.getTyped() != -1) {
                            c13157e.m37501a("type_d", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            c13157e.m37501a("reason_d", campaignEx.getReasond());
                        }
                    }
                    if ("2000048".contains(str4)) {
                        if (campaignEx.getTyped() != -1) {
                            c13157e.m37501a("type", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            c13157e.m37501a("reason", campaignEx.getReasond());
                        }
                        c13157e.m37501a(CampaignEx.JSON_KEY_RETARGET_TYPE, Integer.valueOf(campaignEx.getRtinsType()));
                    }
                    if (campaignEx.getAdType() == 94 || campaignEx.getAdType() == 287) {
                        if (Arrays.asList(C13153b.f36146j).contains(str4)) {
                            c13157e.m37501a(CampaignEx.KEY_SHOW_INDEX, Integer.valueOf(campaignEx.getShowIndex()));
                            c13157e.m37501a("trigger_show_type", Integer.valueOf(campaignEx.getShowType()));
                            if (Arrays.asList(C13153b.f36148l).contains(str4)) {
                                c13157e.m37501a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? C13152a.f36133e : C13152a.f36134f));
                            }
                            if (str4.equals("2000147")) {
                                c13157e.m37501a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? C13152a.f36133e : C13152a.f36134f));
                            }
                        }
                        if (TextUtils.equals(str4, "2000130")) {
                            String strM36781j = campaignEx.getRewardTemplateMode() != null ? campaignEx.getRewardTemplateMode().m36781j() : "";
                            String str10 = campaignEx.getendcard_url();
                            str3 = str8;
                            c13157e.m37501a("ec_full_screen_click", Integer.valueOf((TextUtils.isEmpty(str10) || !str10.contains("alecfc=1")) ? C13152a.f36136h : C13152a.f36135g));
                            c13157e.m37501a("temp_full_screen_click", Integer.valueOf((TextUtils.isEmpty(strM36781j) || !strM36781j.contains("alecfc=1")) ? C13152a.f36136h : C13152a.f36135g));
                            int i2 = campaignEx.getPlayable_ads_without_video() == 2 ? i : 0;
                            C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), c13154c.m37413B());
                            c13157e.m37501a("video_skip_result", Integer.valueOf(c14223cM42671c == null ? 2 : c14223cM42671c.m42690E()));
                            if (i2 != 0) {
                                c13157e.m37501a(CampaignEx.VIDEO_END_TYPE, 2);
                            } else {
                                c13157e.m37501a(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                            }
                        } else {
                            str3 = str8;
                        }
                        if (Arrays.asList(C13153b.f36147k).contains(str4)) {
                            int clickTempSource = campaignEx.getClickTempSource();
                            if (clickTempSource == i) {
                                if (campaignEx.getRewardTemplateMode().m36781j().contains("alecfc=1")) {
                                    c13157e.m37501a("full_screen_click", Integer.valueOf(C13152a.f36135g));
                                } else {
                                    c13157e.m37501a("full_screen_click", Integer.valueOf(C13152a.f36136h));
                                }
                                c13157e.m37501a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? C13152a.f36133e : C13152a.f36134f));
                            } else if (clickTempSource == 2) {
                                String str11 = campaignEx.getendcard_url();
                                if ((campaignEx.getMof_tplid() != 501 || TextUtils.isEmpty(campaignEx.getMof_template_url())) ? !TextUtils.isEmpty(str11) ? str11.contains("alecfc=1") : false : campaignEx.getMof_template_url().contains("alecfc=1")) {
                                    c13157e.m37501a("full_screen_click", Integer.valueOf(C13152a.f36135g));
                                } else {
                                    c13157e.m37501a("full_screen_click", Integer.valueOf(C13152a.f36136h));
                                }
                                c13157e.m37501a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? C13152a.f36133e : C13152a.f36134f));
                            }
                            c13157e.m37501a(CampaignEx.KEY_CLICK_TEMP_SOURCE, Integer.valueOf(campaignEx.getClickTempSource()));
                            c13157e.m37501a("trigger_click_type", Integer.valueOf(campaignEx.getClickType()));
                            c13157e.m37501a(CampaignEx.KEY_TRIGGER_CLICK_SOURCE, Integer.valueOf(campaignEx.getTriggerClickSource()));
                        }
                        str4 = str;
                        str5 = str3;
                    } else {
                        str5 = str8;
                    }
                    str6 = str2;
                }
            }
            return c13157e.m37499a();
        } catch (Exception e3) {
            e = e3;
        }
        if (MBridgeConstans.DEBUG) {
            e.printStackTrace();
        }
        return c13157e.m37499a();
    }

    /* JADX INFO: renamed from: d */
    private Map<String, String> m37510d(String str, C13154c c13154c) {
        return (c13154c == null || TextUtils.isEmpty(str)) ? new HashMap() : c13154c.m37431c(str);
    }

    /* JADX INFO: renamed from: e */
    private Map<String, String> m37511e(String str, C13154c c13154c) {
        C13157e c13157e = new C13157e();
        try {
            if (str.equals("2000125")) {
                c13157e.m37501a("duration", Long.valueOf(c13154c.m37426b("2000123")));
            } else if (str.equals("2000126")) {
                c13157e.m37501a("duration", Long.valueOf(c13154c.m37426b("2000125")));
            } else if (str.equals("2000127")) {
                c13157e.m37501a("duration", Long.valueOf(c13154c.m37426b("2000123")));
            } else if (str.equals("2000154")) {
                c13157e.m37501a("duration", Long.valueOf(c13154c.m37426b("2000126")));
            } else if (str.equals("2000047") || str.equals("2000048")) {
                c13157e.m37501a("duration", Long.valueOf(c13154c.m37426b("2000123")));
            } else if (str.equals("2000155")) {
                c13157e.m37501a("duration", Long.valueOf(c13154c.m37426b("2000154")));
            } else if (str.equals("2000146")) {
                c13157e.m37501a("duration", Long.valueOf(c13154c.m37426b("2000130")));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return c13157e.m37499a();
    }

    /* JADX INFO: renamed from: a */
    public void m37513a(String str, C13826m c13826m, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
        Map<String, String> mapM37511e;
        HashMap map = new HashMap();
        if (c13154c == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c13154c.m37448j(str);
            Map<String, String> mapM37509c = m37509c(str, c13154c);
            if (mapM37509c != null) {
                map.putAll(mapM37509c);
            }
            Map<String, String> mapM37508a = m37508a(str, c13154c.m37413B(), c13826m);
            if (mapM37508a != null) {
                map.putAll(mapM37508a);
            }
            if (Arrays.asList(C13153b.f36140d).contains(str) && (mapM37511e = m37511e(str, c13154c)) != null) {
                map.putAll(mapM37511e);
            }
            Map<String, String> mapM37512a = m37512a(str, c13154c);
            if (mapM37512a != null) {
                map.putAll(mapM37512a);
            }
            Map<String, String> mapM37514b = m37514b(str, c13154c);
            if (mapM37514b != null) {
                map.putAll(mapM37514b);
            }
            if (!map.containsKey("lrid") || TextUtils.isEmpty(map.get("lrid"))) {
                map.put("lrid", c13154c.m37463t());
            }
            if (map.containsKey("lrid")) {
                String str2 = map.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    map.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (map.containsKey("n_lrid")) {
                String str3 = map.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    map.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> mapM37510d = m37510d(str, c13154c);
            if (mapM37510d != null) {
                map.putAll(mapM37510d);
            }
            String str4 = "1";
            if (c13154c.m37447j() == null || !c13154c.m37447j().equals("1") || !Arrays.asList(C13153b.f36138b).contains(str) || c13154c.m37441g() == 296) {
                if (Arrays.asList(C13153b.f36149m).contains(str)) {
                    map.put("use_local_dns", C13859i.m41292b().m41302e() ? "1" : "0");
                    if (!C13859i.m41292b().m41301d()) {
                        str4 = "0";
                    }
                    map.put("local_dns_available", str4);
                }
                C13818e c13818eM37506a = m37506a(str, map);
                if (c13826m != null && c13818eM37506a != null) {
                    c13826m.m41081d(c13818eM37506a);
                }
                if (interfaceC13155a != null) {
                    interfaceC13155a.m37470a();
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37515b(String str, C13826m c13826m, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
        if (c13154c == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = new HashMap();
            c13154c.m37448j(str);
            Map<String, String> mapM37508a = m37508a(str, c13154c.m37413B(), c13826m);
            if (mapM37508a != null) {
                map.putAll(mapM37508a);
            }
            Map<String, String> mapM37512a = m37512a(str, c13154c);
            if (mapM37512a != null) {
                map.putAll(mapM37512a);
            }
            Map<String, String> mapM37514b = m37514b(str, c13154c);
            if (mapM37514b != null) {
                map.putAll(mapM37514b);
            }
            Map<String, String> mapM37510d = m37510d(str, c13154c);
            if (mapM37510d != null) {
                map.putAll(mapM37510d);
            }
            C13818e c13818eM37506a = m37506a(str, map);
            if (c13826m != null && c13818eM37506a != null) {
                c13826m.m41081d(c13818eM37506a);
            }
            if (interfaceC13155a != null) {
                interfaceC13155a.m37470a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m37514b(String str, C13154c c13154c) {
        HashMap map = new HashMap();
        if (c13154c == null) {
            return map;
        }
        return c13154c.m37419a(c13154c.m37463t() + str);
    }

    /* JADX INFO: renamed from: a */
    private C13818e m37506a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        C13818e c13818e = new C13818e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean boolM37096a = C13089b.m37095b().m37096a();
            if (boolM37096a != null) {
                jSONObject.put("r_v_r", boolM37096a.booleanValue() ? 1 : 0);
            }
            c13818e.m41006a(jSONObject);
            c13818e.m41008b(0);
            c13818e.m41002a(0);
            return c13818e;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return c13818e;
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m37508a(String str, String str2, C13826m c13826m) {
        C13157e c13157e = new C13157e();
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            if (!TextUtils.isEmpty(c13635gM39718d.m39546o0())) {
                c13157e.m37501a("as_rid", c13635gM39718d.m39546o0());
            }
            String strM39419K = c13635gM39718d.m39419K();
            JSONArray jSONArrayM39416J = c13635gM39718d.m39416J();
            if (jSONArrayM39416J != null) {
                for (int i = 0; i < jSONArrayM39416J.length(); i++) {
                    if (str.equals(jSONArrayM39416J.getString(i))) {
                        strM39419K = BuildConfig.VERSION_NAME;
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(strM39419K)) {
                c13157e.m37501a("log_rate", strM39419K);
            } else {
                c13157e.m37501a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                C13640l c13640lM39719d = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), str2);
                if (c13640lM39719d != null && !TextUtils.isEmpty(c13640lM39719d.m39612I())) {
                    c13157e.m37501a("us_rid", c13640lM39719d.m39612I());
                }
                if (c13640lM39719d != null && !TextUtils.isEmpty(c13640lM39719d.m39617a())) {
                    c13157e.m37501a("u_stid", c13640lM39719d.m39617a());
                }
                C13157e c13157eM37494c = C13156d.m37475b().m37494c(str2);
                if (c13157eM37494c != null) {
                    if (c13826m != null && c13826m.m41078c() != null) {
                        try {
                            c13826m.m41078c().put("r_stid", c13157eM37494c.m37504b("r_stid"));
                            c13157eM37494c.m37505c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    c13157e.m37500a(c13157eM37494c);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return c13157e.m37499a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007d A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:22:0x0054, B:24:0x005a, B:27:0x0065, B:29:0x006b, B:25:0x005f, B:30:0x006f, B:32:0x0075, B:33:0x007d, B:35:0x0083, B:38:0x008e, B:40:0x0094, B:36:0x0088, B:11:0x003d, B:13:0x0041, B:16:0x0049, B:18:0x004d), top: B:49:0x0007, inners: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:19:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:19:0x0050). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    private List<CampaignEx> m37507a(C13154c c13154c, String str) {
        int iIntValue;
        List<CampaignEx> listM37453m;
        List<CampaignEx> listM37453m2;
        ArrayList arrayList = new ArrayList();
        if (c13154c != null) {
            try {
                String str2 = c13154c.m37463t() + str;
                Map<String, Map<String, String>> mapM37466w = c13154c.m37466w();
                if (mapM37466w == null || !mapM37466w.containsKey(str2)) {
                    iIntValue = -1;
                    if (iIntValue == 1) {
                        if (c13154c.m37457o() != null) {
                            listM37453m2 = c13154c.m37457o();
                        } else {
                            listM37453m2 = c13154c.m37453m();
                        }
                        if (listM37453m2 != null && listM37453m2.size() > 0) {
                            arrayList.addAll(listM37453m2);
                        }
                    } else if (c13154c.m37455n() != null) {
                        arrayList.add(c13154c.m37455n());
                    } else {
                        if (c13154c.m37457o() != null) {
                            listM37453m = c13154c.m37457o();
                        } else {
                            listM37453m = c13154c.m37453m();
                        }
                        if (listM37453m != null && listM37453m.size() > 0) {
                            arrayList.addAll(listM37453m);
                        }
                    }
                } else {
                    try {
                        Object obj = mapM37466w.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            iIntValue = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else {
                            iIntValue = -1;
                        }
                    } catch (NumberFormatException e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    if (iIntValue == 1) {
                        if (c13154c.m37457o() != null) {
                            listM37453m2 = c13154c.m37457o();
                        } else {
                            listM37453m2 = c13154c.m37453m();
                        }
                        if (listM37453m2 != null) {
                            arrayList.addAll(listM37453m2);
                        }
                    } else if (c13154c.m37455n() != null) {
                        arrayList.add(c13154c.m37455n());
                    } else {
                        if (c13154c.m37457o() != null) {
                            listM37453m = c13154c.m37457o();
                        } else {
                            listM37453m = c13154c.m37453m();
                        }
                        if (listM37453m != null) {
                            arrayList.addAll(listM37453m);
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m37512a(String str, C13154c c13154c) {
        HashMap map = new HashMap();
        try {
            if (Arrays.asList(C13153b.f36141e).contains(str)) {
                String strM37447j = "";
                if (c13154c != null) {
                    strM37447j = c13154c.m37447j();
                }
                map.put("auto_load", strM37447j);
            }
            if (c13154c != null) {
                Map<String, Map<String, String>> mapM37466w = c13154c.m37466w();
                String str2 = c13154c.m37463t() + str;
                if (mapM37466w.containsKey(str2) && mapM37466w.get(str2) != null) {
                    map.putAll(mapM37466w.get(str2));
                }
                try {
                    Map<String, Map<String, String>> mapM37465v = c13154c.m37465v();
                    String str3 = c13154c.m37463t() + "_" + c13154c.m37460q() + "_" + str;
                    if (mapM37465v.containsKey(str3) && mapM37465v.get(str3) != null) {
                        map.putAll(mapM37465v.get(str3));
                        return map;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return map;
    }
}
