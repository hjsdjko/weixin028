<template>
<view class="content">
	<view :style='{"width":"100%","flexWrap":"wrap","background":"#ffffff","display":"flex","height":"100%"}'>
		<swiper :style='{"width":"100%","margin":"0 0 20rpx 0","background":"#ffffff","height":"360rpx"}' class="swiper" :indicator-dots='true' :autoplay='true' :circular='true' indicator-active-color='#ff746d' indicator-color='#33333330' :duration='500' :interval='5000' :vertical='true'>
			<swiper-item :style='{"width":"100%","background":"#ffffff","height":"100%"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333333","background":"#ffffff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0px 0px 0px 40rpx","margin":"40rpx 0px 20rpx 0px","borderColor":"#eee","borderRadius":"8rpx","flexWrap":"wrap","background":"#ffffff","borderWidth":"0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
            <block v-for="(item,ind) in menuList" v-bind:key="item.roleName">
                <block v-if="ind==0" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
					<view v-if="menu.childs.length" :style='{"width":"calc(25% - 40rpx)","padding":"12rpx 0 12rpx 0","margin":"0px 40rpx 20rpx 0","borderRadius":"16rpx","height":"auto"}' class="menu-list" @tap="menuClick(menu,index)">
						<view class="iconarr" :class="menu.fontClass" :style='{"border":"4rpx solid #fff000","padding":"0 0 0 0","boxShadow":"2rpx 4rpx 8rpx #999999","margin":"0 auto 12rpx auto","color":"#ffffff","textAlign":"center","display":"block","borderRadius":"0","background":"#ff796b","width":"128rpx","lineHeight":"96rpx","fontSize":"60rpx","height":"96rpx"}'></view>
						<view :style='{"padding":"0 0 0 0","margin":"0px auto 0 auto","color":"#333333","textAlign":"center","width":"100%","lineHeight":"1.5","fontSize":"26rpx"}'>{{menu.menu}}</view>
					</view>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
																		<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231130/99a276c461c94b9a9ab19652b1976f71.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#333","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>结伴旅行</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#666","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('jiebanlvxing')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  <!-- 样式1 -->
		  <view class="list-box style1" :style='{"padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('jiebanlvxing',product.id)" v-for="(product,index) in homejiebanlvxinglist" :key="index" class="list-item" :style='{"border":"0px solid #3da74250","boxShadow":"0 0px 0px #cccccc","padding":"20rpx","margin":"0 0 40rpx 0","backgroundColor":"#ffffff","borderRadius":"8rpx","textAlign":"center","flexWrap":"wrap","display":"flex","width":"48%","justifyContent":"center","height":"auto"}'>
			                			  			  <image :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","objectFit":"cover","borderRadius":"0px","display":"inline-block","width":"100%","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-if="product.tupian.substring(0,4)=='http'" :src="product.tupian"></image>
			  <image :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","objectFit":"cover","borderRadius":"0px","display":"inline-block","width":"100%","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.tupian?baseUrl+product.tupian.split(',')[0]:''"></image>
			  			  			                			  			  			                			  			  			                			  			  			                			  			  			                			  			  			                			  <view :style='{"border":"2rpx solid #eeeeee","padding":"0px 20rpx 0px 20rpx","margin":"0 0 12rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"0px","background":"#fff00010","width":"100%","fontSize":"28rpx","lineHeight":"48rpx","textOverflow":"ellipsis","height":"48rpx","order":"2"}' class="list-item-title ">用户姓名:{{product.yonghuxingming}}</view>
			  			  			  			                			  <view :style='{"border":"2rpx solid #eeeeee","padding":"0px 20rpx 0px 20rpx","margin":"0 0 12rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"0px","background":"#fff00010","width":"100%","fontSize":"28rpx","lineHeight":"48rpx","textOverflow":"ellipsis","height":"48rpx","order":"2"}' class="list-item-title ">手机号码:{{product.shoujihaoma}}</view>
			  			  			  			                			  			  			                			  			  			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
								<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231130/99a276c461c94b9a9ab19652b1976f71.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#333","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>景点信息</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#666","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('jingdianxinxi')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  <!-- 样式1 -->
		  <view class="list-box style1" :style='{"padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('jingdianxinxi',product.id)" v-for="(product,index) in homejingdianxinxilist" :key="index" class="list-item" :style='{"border":"0px solid #3da74250","boxShadow":"0 0px 0px #cccccc","padding":"20rpx","margin":"0 0 40rpx 0","backgroundColor":"#ffffff","borderRadius":"8rpx","textAlign":"center","flexWrap":"wrap","display":"flex","width":"48%","justifyContent":"center","height":"auto"}'>
			                			  <view :style='{"border":"2rpx solid #eeeeee","padding":"0px 20rpx 0px 20rpx","margin":"0 0 12rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"0px","background":"#fff00010","width":"100%","fontSize":"28rpx","lineHeight":"48rpx","textOverflow":"ellipsis","height":"48rpx","order":"2"}' class="list-item-title ">{{product.jingdianmingcheng}}</view>
			  			  			  			                			  			  <image :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","objectFit":"cover","borderRadius":"0px","display":"inline-block","width":"100%","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-if="product.jingdiantupian.substring(0,4)=='http'" :src="product.jingdiantupian"></image>
			  <image :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","objectFit":"cover","borderRadius":"0px","display":"inline-block","width":"100%","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.jingdiantupian?baseUrl+product.jingdiantupian.split(',')[0]:''"></image>
			  			  			                			  <view :style='{"border":"2rpx solid #eeeeee","padding":"0px 20rpx 0px 20rpx","margin":"0 0 12rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"0px","background":"#fff00010","width":"100%","fontSize":"28rpx","lineHeight":"48rpx","textOverflow":"ellipsis","height":"48rpx","order":"2"}' class="list-item-title ">门票价格:{{product.menpiaojiage}}</view>
			  			  			  			                			  			  			                			  			  			                			  			  			                			  			  			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231130/99a276c461c94b9a9ab19652b1976f71.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#333","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>特色美食</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#666","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('tesemeishi')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  <!-- 样式1 -->
		  <view class="list-box style1" :style='{"padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('tesemeishi',product.id)" v-for="(product,index) in hometesemeishilist" :key="index" class="list-item" :style='{"border":"0px solid #3da74250","boxShadow":"0 0px 0px #cccccc","padding":"20rpx","margin":"0 0 40rpx 0","backgroundColor":"#ffffff","borderRadius":"8rpx","textAlign":"center","flexWrap":"wrap","display":"flex","width":"48%","justifyContent":"center","height":"auto"}'>
			                			  <view :style='{"border":"2rpx solid #eeeeee","padding":"0px 20rpx 0px 20rpx","margin":"0 0 12rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"0px","background":"#fff00010","width":"100%","fontSize":"28rpx","lineHeight":"48rpx","textOverflow":"ellipsis","height":"48rpx","order":"2"}' class="list-item-title ">{{product.meishimingcheng}}</view>
			  			  			  			                			  			  <image :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","objectFit":"cover","borderRadius":"0px","display":"inline-block","width":"100%","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-if="product.meishitupian.substring(0,4)=='http'" :src="product.meishitupian"></image>
			  <image :style='{"padding":"0 0 0 0","margin":"0 0 20rpx 0","objectFit":"cover","borderRadius":"0px","display":"inline-block","width":"100%","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.meishitupian?baseUrl+product.meishitupian.split(',')[0]:''"></image>
			  			  			                			  <view :style='{"border":"2rpx solid #eeeeee","padding":"0px 20rpx 0px 20rpx","margin":"0 0 12rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"0px","background":"#fff00010","width":"100%","fontSize":"28rpx","lineHeight":"48rpx","textOverflow":"ellipsis","height":"48rpx","order":"2"}' class="list-item-title ">推荐指数:{{product.tuijianzhishu}}</view>
			  			  			  			                			  			  			                			  			  			                			  			  			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																										<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
																																																																								<!-- 新闻资讯 -->
				

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				homejiebanlvxinglist: [],
				homejingdianxinxilist: [],
				hometesemeishilist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            
        },
		async onShow() {
			this.swiperMenuList = []
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
			let role = '管理员'
			this.menuList.forEach((item,key) => {
			    if(role==item.roleName) {
			        item.frontMenu.forEach((item2,key2) => {
						if(item2.child.length) {
							item2.childs = []
						    item2.child.forEach((item3,key3)=>{
								if(item3.buttons.indexOf("查看")>-1){
									item2.childs.push(item3)
									this.swiperMenuList.push(item3);
								}
							})
						}
			            
			        })
			    }
			})
            // let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}


			res = await this.$api.list('jiebanlvxing', {
                sfsh :'是',
				page: 1,

				limit: 4
			});
			this.homejiebanlvxinglist = res.data.list
			res = await this.$api.list('jingdianxinxi', {
				page: 1,

				limit: 4
			});
			this.homejingdianxinxilist = res.data.list
			res = await this.$api.list('tesemeishi', {
				page: 1,

				limit: 4
			});
			this.hometesemeishilist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(tableName=='news'){
					uni.navigateTo({
						url: `../news-list/news-list`,
						fail: function(){
							uni.switchTab({
								url: `../news-list/news-list`
							});
						}
					});
					return false
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
			menuClick(menu, index) {
				if (menu.childs.length > 0 && menu.childs.length == 1) {
					uni.navigateTo({
						url: `../${menu.childs[0].tableName}/list`,
						fail: function() {
							uni.switchTab({
								url: `../${menu.childs[0].tableName}/list`
							});
						}
					});
				} else if (menu.childs.length > 1) {
					let arr = []
					for(let x in menu.childs){
						arr.push(menu.childs[x].menu.length>6?menu.childs[x].menu.substring(0,6):menu.childs[x].menu)
					}
					uni.showActionSheet({
						itemList: arr,
						success: function (res) {
							uni.navigateTo({
								url: `../${menu.childs[res.tapIndex].tableName}/list`,
								fail: function() {
									uni.switchTab({
										url: `../${menu.childs[res.tapIndex].tableName}/list`
									});
								}
							});
						}
					});
				}
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
