(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-jiebanlvxing-add-or-update"],{"449e":function(e,r,t){"use strict";t.r(r);var i=t("4729"),n=t("b3e5");for(var o in n)"default"!==o&&function(e){t.d(r,e,(function(){return n[e]}))}(o);t("aa1c");var a,s=t("f0c5"),u=Object(s["a"])(n["default"],i["b"],i["c"],!1,null,"09964f34",null,!1,i["a"],a);r["default"]=u.exports},4729:function(e,r,t){"use strict";var i,n=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ffffff",height:"100%"}},[t("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"#ffffff",display:"block",height:"auto"}},[t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.tupianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("图片")]),e.ruleForm.tupian?t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.tupian.split(",")[0],mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("起点")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.qidian,placeholder:"起点"},model:{value:e.ruleForm.qidian,callback:function(r){e.$set(e.ruleForm,"qidian",r)},expression:"ruleForm.qidian"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("途径城市")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.tujingchengshi,placeholder:"途径城市"},model:{value:e.ruleForm.tujingchengshi,callback:function(r){e.$set(e.ruleForm,"tujingchengshi",r)},expression:"ruleForm.tujingchengshi"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("目的地")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.mudedi,placeholder:"目的地"},model:{value:e.ruleForm.mudedi,callback:function(r){e.$set(e.ruleForm,"mudedi",r)},expression:"ruleForm.mudedi"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("出行方式")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chuxingfangshi,placeholder:"出行方式"},model:{value:e.ruleForm.chuxingfangshi,callback:function(r){e.$set(e.ruleForm,"chuxingfangshi",r)},expression:"ruleForm.chuxingfangshi"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("用户账号")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.yonghuzhanghao,placeholder:"用户账号"},model:{value:e.ruleForm.yonghuzhanghao,callback:function(r){e.$set(e.ruleForm,"yonghuzhanghao",r)},expression:"ruleForm.yonghuzhanghao"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("用户姓名")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.yonghuxingming,placeholder:"用户姓名"},model:{value:e.ruleForm.yonghuxingming,callback:function(r){e.$set(e.ruleForm,"yonghuxingming",r)},expression:"ruleForm.yonghuxingming"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"2rpx 2rpx 2rpx 2rpx",background:"#fdfbdc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("手机号码")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.shoujihaoma,placeholder:"手机号码"},model:{value:e.ruleForm.shoujihaoma,callback:function(r){e.$set(e.ruleForm,"shoujihaoma",r)},expression:"ruleForm.shoujihaoma"}})],1),t("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[t("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#333",borderRadius:"8rpx",background:"#fff000",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)],1)},o=[];t.d(r,"b",(function(){return n})),t.d(r,"c",(function(){return o})),t.d(r,"a",(function(){return i}))},"7efe":function(e,r,t){var i=t("24fb");r=i(!1),r.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-09964f34]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=r},aa1c:function(e,r,t){"use strict";var i=t("c553"),n=t.n(i);n.a},b3e5:function(e,r,t){"use strict";t.r(r);var i=t("e968"),n=t.n(i);for(var o in i)"default"!==o&&function(e){t.d(r,e,(function(){return i[e]}))}(o);r["default"]=n.a},c553:function(e,r,t){var i=t("7efe");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var n=t("4f06").default;n("04296671",i,!0,{sourceMap:!1,shadowMode:!1})},e968:function(e,r,t){"use strict";var i=t("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,t("a481"),t("c5f6"),t("f559"),t("456d"),t("ac6a"),t("28a5"),t("96cf");var n=i(t("3b8d")),o=i(t("e2b1")),a=i(t("064f")),s=i(t("bd56")),u={data:function(){return{cross:"",ruleForm:{tupian:"",qidian:"",tujingchengshi:"",mudedi:"",chuxingfangshi:"",yonghuzhanghao:"",yonghuxingming:"",shoujihaoma:"",sfsh:"待审核",shhf:""},user:{},ro:{tupian:!1,qidian:!1,tujingchengshi:!1,mudedi:!1,chuxingfangshi:!1,yonghuzhanghao:!1,yonghuxingming:!1,shoujihaoma:!1,sfsh:!1,shhf:!1}}},components:{wPicker:o.default,xiaEditor:a.default,multipleSelect:s.default},watch:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(r){var t,i,n,o;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:if(i=e.sent,this.user=i.data,this.ruleForm.yonghuzhanghao=this.user.yonghuzhanghao,this.ro.yonghuzhanghao=!0,this.ruleForm.yonghuxingming=this.user.yonghuxingming,this.ro.yonghuxingming=!0,this.ruleForm.shoujihaoma=this.user.shoujihaoma,this.ro.shoujihaoma=!0,this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){e.next=19;break}return this.ruleForm.id=r.id,e.next=17,this.$api.info("jiebanlvxing",this.ruleForm.id);case 17:i=e.sent,this.ruleForm=i.data;case 19:if(this.cross=r.cross,!r.cross){e.next=59;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 23:if((e.t1=e.t0()).done){e.next=59;break}if(o=e.t1.value,"tupian"!=o){e.next=29;break}return this.ruleForm.tupian=n[o].split(",")[0],this.ro.tupian=!0,e.abrupt("continue",23);case 29:if("qidian"!=o){e.next=33;break}return this.ruleForm.qidian=n[o],this.ro.qidian=!0,e.abrupt("continue",23);case 33:if("tujingchengshi"!=o){e.next=37;break}return this.ruleForm.tujingchengshi=n[o],this.ro.tujingchengshi=!0,e.abrupt("continue",23);case 37:if("mudedi"!=o){e.next=41;break}return this.ruleForm.mudedi=n[o],this.ro.mudedi=!0,e.abrupt("continue",23);case 41:if("chuxingfangshi"!=o){e.next=45;break}return this.ruleForm.chuxingfangshi=n[o],this.ro.chuxingfangshi=!0,e.abrupt("continue",23);case 45:if("yonghuzhanghao"!=o){e.next=49;break}return this.ruleForm.yonghuzhanghao=n[o],this.ro.yonghuzhanghao=!0,e.abrupt("continue",23);case 49:if("yonghuxingming"!=o){e.next=53;break}return this.ruleForm.yonghuxingming=n[o],this.ro.yonghuxingming=!0,e.abrupt("continue",23);case 53:if("shoujihaoma"!=o){e.next=57;break}return this.ruleForm.shoujihaoma=n[o],this.ro.shoujihaoma=!0,e.abrupt("continue",23);case 57:e.next=23;break;case 59:this.styleChange(),this.$forceUpdate();case 61:case"end":return e.stop()}}),e,this)})));function r(r){return e.apply(this,arguments)}return r}(),methods:{styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var r={color:"#666666"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var r={color:"#666"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var r={color:"#666666"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var r={color:"#666"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #ffb400",borderRadius:"100%",color:"#666",background:"#fff000"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #ffb400",color:"#666",borderRadius:"100%",background:"#fff000"};Object.keys(r).forEach((function(t){e.style[t]=r[t]}))}))}))},tupianTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.tupian="file/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var r,t,i,n,o,a,s,u,l,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.ruleForm.shoujihaoma||this.$validate.isMobile(this.ruleForm.shoujihaoma)){e.next=3;break}return this.$utils.msg("手机号码应输入手机格式"),e.abrupt("return");case 3:if(!this.cross){e.next=20;break}if(uni.setStorageSync("crossCleanType",!0),o=uni.getStorageSync("statusColumnName"),a=uni.getStorageSync("statusColumnValue"),""==o){e.next=20;break}if(r||(r=uni.getStorageSync("crossObj")),o.startsWith("[")){e.next=16;break}for(s in r)s==o&&(r[s]=a);return u=uni.getStorageSync("crossTable"),e.next=14,this.$api.update("".concat(u),r);case 14:e.next=20;break;case 16:t=Number(uni.getStorageSync("userid")),i=r["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 20:if(!i||!t){e.next=43;break}return this.ruleForm.crossuserid=t,this.ruleForm.crossrefid=i,l={page:1,limit:10,crossuserid:t,crossrefid:i},e.next=26,this.$api.list("jiebanlvxing",l);case 26:if(d=e.sent,!(d.data.total>=n)){e.next=33;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 33:if(!this.ruleForm.id){e.next=38;break}return e.next=36,this.$api.update("jiebanlvxing",this.ruleForm);case 36:e.next=40;break;case 38:return e.next=40,this.$api.add("jiebanlvxing",this.ruleForm);case 40:this.$utils.msgBack("提交成功");case 41:e.next=51;break;case 43:if(!this.ruleForm.id){e.next=48;break}return e.next=46,this.$api.update("jiebanlvxing",this.ruleForm);case 46:e.next=50;break;case 48:return e.next=50,this.$api.add("jiebanlvxing",this.ruleForm);case 50:this.$utils.msgBack("提交成功");case 51:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,t=r.getFullYear(),i=r.getMonth()+1,n=r.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,n=n>9?n:"0"+n,"".concat(t,"-").concat(i,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};r.default=u}}]);