<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="We care your health, 이미지로 검색, 키워드로 검색, 영양 성분 찾기, 약국 찾기">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>HOME</title>
    
    <style>
	.u-section-1 {background-image: url("<c:url value='/resources/images/pill.png'/>"); background-position: 50% 50%}
	</style>
<!--     <link rel="stylesheet" href="nicepage.css" media="screen"> -->
<!-- <link rel="stylesheet" href="HOME.css" media="screen"> -->
   
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/nicepage.css" media="screen">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/HOME.css" media="screen">
   
    <script class="u-script" type="text/javascript" src="<c:url value='/resources/css/jquery.js' />" defer=""></script>
    <script class="u-script" type="text/javascript" src="<c:url value='/resources/css/nicepage.js' />" defer=""></script>
    <meta name="generator" content="Nicepage 2.24.4, nicepage.com">
    
    
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i|Playfair+Display:400,400i,700,700i,900,900i|size-14">
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"url": "index.jsp",
		"logo": "images/54e3d4454856a814f6da8c7dda793678153bdee757596c48702672d39e4dc650bd_1280.png"
}</script>

<script>

	function uploadck() {
	      open("<c:url value='/uploadform' />", "_blank", "width=500, height=200");
	   }
	   
</script>


<!-- 	알약 확인 -->
	<c:choose>
		<c:when test="${requestScope.label.length == 0}">
			<script>alert("알약이 아닙니다.")</script>
		</c:when>
	</c:choose>


    <meta property="og:title" content="HOME">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="index.jsp">
    <meta property="og:url" content="index.jsp">
  </head>
  <body class="u-body"><header class="u-align-center-xs u-border-1 u-border-grey-25 u-clearfix u-header u-header" id="sec-7399"><div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <a href="https://nicepage.com" class="u-image u-logo u-image-1" data-image-width="1274" data-image-height="1280">
          <img src="resources/images/54e3d4454856a814f6da8c7dda793678153bdee757596c48702672d39e4dc650bd_1280.png" class="u-logo-image u-logo-image-1" data-image-width="56">
        </a>
        <nav class="u-align-left u-menu u-menu-dropdown u-nav-spacing-25 u-offcanvas u-menu-1">
          <div class="menu-collapse u-custom-font" style="font-size: 1.5rem; font-family: size-14;">
            <a class="u-button-style u-nav-link" href="#" style="padding: 4px 0; font-size: calc(1em + 8px);">
              <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 302 302" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-7b92"></use></svg>
              <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="svg-7b92" x="0px" y="0px" viewBox="0 0 302 302" style="enable-background:new 0 0 302 302;" xml:space="preserve" class="u-svg-content"><g><rect y="36" width="302" height="30"></rect><rect y="236" width="302" height="30"></rect><rect y="136" width="302" height="30"></rect>
</g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-custom-font u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="<c:url value='/' />" style="padding: 10px 20px;">HOME</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="<c:url value='loginForm' />" style="padding: 10px 20px;">LOGIN</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="<c:url value='signupForm' />" style="padding: 10px 20px;">SIGN UP</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="<c:url value='/aboutus' />" style="padding: 10px 20px;">ABOUT US</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-align-center u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-menu-close"></div>
              <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="HOME.jsp" style="padding: 10px 20px;">HOME</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="LOGIN.jsp" style="padding: 10px 20px;">LOGIN</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="SIGN-UP.jsp" style="padding: 10px 20px;">SIGN UP</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="ABOUT-US.jsp" style="padding: 10px 20px;">ABOUT US</a>
</li></ul>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
        <h3 class="u-custom-font u-font-playfair-display u-text u-text-default u-text-1">SAMJO</h3>
      </div></header>
    <section class="u-align-center u-clearfix u-image u-section-1" id="carousel_5d2e">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-clearfix u-layout-wrap u-layout-wrap-1">
          <div class="u-layout">
            <div class="u-layout-row">
              <div class="u-align-left u-container-style u-expand-resize u-layout-cell u-left-cell u-size-60 u-layout-cell-1">
                <div class="u-container-layout u-container-layout-1">
                  <h1 class="u-custom-font u-font-roboto-condensed u-text u-text-palette-1-base u-text-1">We can find your&nbsp;</h1>
                  <span class="u-icon u-icon-circle u-text-palette-1-base u-icon-1">
                    <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-997a"></use></svg>
                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 512 512" id="svg-997a"><g><g><circle cx="358.505" cy="409.407" fill="#f9f3f1" r="91.22"></circle>
</g><g><path d="m423.002 473.909c-35.622 35.622-93.375 35.622-128.997 0-1.281-1.281-2.522-2.602-3.703-3.944 35.622 25.353 85.367 22.05 117.306-9.889 34.321-34.321 35.572-89.201 3.743-125.023 4.084 2.903 7.987 6.186 11.651 9.849 35.633 35.623 35.633 93.385 0 129.007z" fill="#efe2dd"></path>
</g><g><g><path d="m247.834 48.235c17.849-33.758 59.684-46.656 93.442-28.807l126.402 66.831c33.758 17.848 46.656 59.684 28.807 93.442-17.849 33.758-59.684 46.656-93.442 28.807l-126.402-66.831c-33.758-17.848-46.655-59.684-28.807-93.442z" fill="#fec165"></path>
</g><g><path d="m496.489 179.702c-.591 1.121-1.211 2.222-1.882 3.303 7.477-30.117-6.156-62.567-34.822-77.721l-126.394-66.83c-32.64-17.256-72.816-5.775-91.563 25.503 1.321-5.345 3.313-10.63 6.005-15.724 17.846-33.761 59.684-46.652 93.445-28.806l126.405 66.831c33.751 17.846 46.652 59.684 28.806 93.444z" fill="#fdb441"></path>
</g><g><path d="m339.842 175.093 64.635-122.25 63.201 33.415c33.758 17.848 46.656 59.684 28.807 93.442-17.849 33.758-59.684 46.656-93.442 28.807z" fill="#6bd9e7"></path>
</g><g><path d="m496.489 179.702c-.33.631-.681 1.251-1.031 1.872-.27.48-.561.961-.851 1.431 7.477-30.117-6.156-62.567-34.822-77.721l-64.889-34.311 9.579-18.126 63.207 33.41c33.752 17.847 46.653 59.685 28.807 93.445z" fill="#2ed1e2"></path>
</g>
</g><g><g><path d="m225.3 193.701c27.235 26.766 27.615 70.543.849 97.778l-100.223 101.977c-26.766 27.235-70.543 27.615-97.778.849-27.235-26.766-27.615-70.543-.849-97.778l100.223-101.977c26.766-27.235 70.543-27.615 97.778-.849z" fill="#7acaa6"></path>
</g><g><path d="m28.146 394.308c-.905-.887-1.782-1.797-2.626-2.749 26.716 15.786 61.71 12.015 84.437-11.112l100.22-101.97c25.878-26.333 26.381-68.114 1.779-95.032 4.743 2.796 9.236 6.218 13.347 10.256 27.238 26.765 27.612 70.542.847 97.78l-100.223 101.98c-26.763 27.228-70.543 27.611-97.781.847z" fill="#57be92"></path>
</g><g><path d="m77.411 245.538 98.627 96.93-50.111 50.988c-26.766 27.235-70.543 27.615-97.778.849-27.235-26.766-27.615-70.543-.849-97.778z" fill="#ee6161"></path>
</g><g><path d="m28.146 394.308c-.51-.497-1.004-1.01-1.498-1.524-.383-.396-.76-.812-1.128-1.225 26.716 15.786 61.71 12.015 84.437-11.112l51.453-52.349 14.625 14.367-50.108 50.996c-26.763 27.228-70.543 27.611-97.781.847z" fill="#e94444"></path>
</g>
</g><g><path d="m471.188 79.622-126.402-66.831c-18.099-9.569-38.844-11.518-58.407-5.486-19.565 6.032-35.61 19.321-45.18 37.421s-11.519 38.843-5.487 58.408 19.321 35.61 37.421 45.18l126.403 66.831c1.424.753 2.861 1.456 4.31 2.111 10.139 4.582 20.826 6.768 31.388 6.767 25.796 0 50.824-13.045 65.166-36.075.956-1.535 1.865-3.115 2.723-4.738 19.754-37.364 5.428-83.833-31.935-103.588zm-191.038 55.419c-14.555-7.695-25.241-20.597-30.092-36.33-4.85-15.733-3.283-32.413 4.412-46.967 7.695-14.554 20.598-25.241 36.331-30.091 5.998-1.849 12.131-2.766 18.234-2.766 9.906 0 19.727 2.415 28.732 7.177l56.565 29.907-57.617 108.977zm209.7 41.151c-15.886 30.045-53.253 41.563-83.297 25.68l-56.565-29.907 57.617-108.976 56.564 29.906c30.045 15.885 41.566 53.252 25.681 83.297z"></path><path d="m180.05 166.432c-4.102-.17-7.641 3.045-7.813 7.188-.173 4.142 3.045 7.64 7.187 7.813 15.276.637 29.7 6.895 40.614 17.622 11.742 11.54 18.287 26.961 18.43 43.425.143 16.463-6.133 31.996-17.674 43.738l-44.849 45.634-87.918-86.406 44.849-45.635c4.803-4.887 10.313-8.903 16.376-11.937 3.708-1.855 5.21-6.365 3.354-10.072-1.854-3.708-6.364-5.208-10.072-3.355-7.548 3.776-14.4 8.769-20.367 14.84l-100.222 101.978c-21.292 21.665-27.063 52.879-17.432 79.723 3.769 10.504 9.896 20.339 18.373 28.671.902.887 1.823 1.749 2.761 2.586 17.343 15.473 41.345 22.7 64.217 18.261 15.725-3.052 30.134-10.306 41.417-21.787l100.221-101.977c14.352-14.602 22.157-33.919 21.98-54.392-.178-20.473-8.317-39.651-22.92-54.002-13.574-13.341-31.513-21.124-50.512-21.916zm-59.478 221.762c-11.451 11.652-27.168 18.289-43.424 18.43-16.43.111-31.996-6.134-43.738-17.674-24.239-23.822-24.578-62.923-.755-87.163l44.848-45.634 87.918 86.406c0 .001-44.841 45.627-44.849 45.635z"></path><path d="m288.694 339.597c-20.344 20.344-30.783 48.481-28.641 77.196.308 4.133 3.893 7.234 8.044 6.927 4.135-.308 7.236-3.91 6.928-8.044-1.817-24.352 7.035-48.212 24.286-65.463 32.639-32.639 85.749-32.639 118.388 0 32.64 32.64 32.64 85.749 0 118.389-15.811 15.811-36.833 24.519-59.194 24.519-22.36 0-43.382-8.708-59.193-24.519-6.527-6.527-11.884-13.992-15.923-22.187-1.833-3.719-6.333-5.247-10.052-3.415-3.719 1.833-5.248 6.333-3.415 10.052 4.766 9.671 11.082 18.475 18.773 26.166 18.647 18.647 43.44 28.916 69.81 28.916s51.164-10.269 69.812-28.916c38.493-38.493 38.493-101.127 0-139.621-38.497-38.493-101.129-38.493-139.623 0z"></path><path d="m391.237 449.646c1.921 0 3.842-.733 5.309-2.199 2.931-2.931 2.931-7.685 0-10.616l-65.465-65.465c-2.932-2.931-7.685-2.931-10.617 0-2.931 2.931-2.931 7.685 0 10.616l65.465 65.465c1.466 1.466 3.388 2.199 5.308 2.199z"></path>
</g>
</g></svg>
                  </span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="u-clearfix u-gutter-0 u-layout-wrap u-layout-wrap-2">
          <div class="u-gutter-0 u-layout">
            <div class="u-layout-row">
              <div class="u-container-style u-layout-cell u-left-cell u-palette-1-base u-size-15 u-layout-cell-2">
                <div class="u-container-layout u-container-layout-2">
                  <span class="u-icon u-icon-circle u-spacing-20 u-text-palette-1-base u-white u-icon-2">
                    <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-31c3"></use></svg>
                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 512 512" id="svg-31c3"><g><path d="m457 101h-100.188l-9.743-29.23c-6.136-18.405-23.293-30.77-42.692-30.77h-96.754c-19.399 0-36.556 12.365-42.691 30.77l-9.744 29.23h-24.188v-25c0-19.299-15.701-35-35-35h-20c-19.299 0-35 15.701-35 35v26.812c-23.568 6.208-41 27.698-41 53.188v260c0 30.327 24.673 55 55 55h402c30.327 0 55-24.673 55-55v-260c0-30.327-24.673-55-55-55zm-386-25c0-2.757 2.243-5 5-5h20c2.757 0 5 2.243 5 5v25h-30zm411 340c0 13.785-11.215 25-25 25h-402c-13.785 0-25-11.215-25-25v-260c0-13.785 11.215-25 25-25h111c6.456 0 12.188-4.131 14.23-10.257l13.162-39.486c2.046-6.135 7.764-10.257 14.231-10.257h96.754c6.467 0 12.186 4.122 14.23 10.256l13.162 39.487c2.043 6.126 7.775 10.257 14.231 10.257h111c13.785 0 25 11.215 25 25z"></path><circle cx="436" cy="176" r="15"></circle><path d="m106 161h-30c-8.284 0-15 6.716-15 15s6.716 15 15 15h30c8.284 0 15-6.716 15-15s-6.716-15-15-15z"></path><g><path d="m256 411c-74.439 0-135-60.561-135-135s60.561-135 135-135 135 60.561 135 135-60.561 135-135 135zm0-240c-57.897 0-105 47.103-105 105s47.103 105 105 105 105-47.103 105-105-47.103-105-105-105z"></path>
</g><g><path d="m256 351c-41.355 0-75-33.645-75-75s33.645-75 75-75 75 33.645 75 75-33.645 75-75 75zm0-120c-24.813 0-45 20.187-45 45s20.187 45 45 45 45-20.187 45-45-20.187-45-45-45z"></path>
</g>
</g></svg>
                  </span>
                  <h2 class="u-align-center u-custom-font u-font-roboto-condensed u-text u-text-2">이미지로 검색</h2>
                  <p class="u-align-center u-text u-text-3">약의 사진 및 처방전을&nbsp;<br>이용하여 검색<br>
                  </p>
                  
                  
<!--                   <a href="https://nicepage.com" class="u-btn u-button-style u-text-palette-1-base u-white u-btn-1">의약품</a> -->
                  <input type="button" value="의약품" onclick="uploadck()" class="u-btn u-button-style u-text-palette-1-base u-white u-btn-1">
<!--                   <input type="button" value="처방전" onclick="uploadck()" class="u-btn u-button-style u-text-palette-1-base u-white u-btn-2"> -->
                  <a href="https://nicepage.com" class="u-btn u-button-style u-text-palette-1-base u-white u-btn-2">처방전</a>
<!--                   <a href="https://nicepage.com" class="u-btn u-button-style u-text-palette-1-base u-white u-btn-2">처방전</a> -->
                </div>
              </div>
              <div class="u-container-style u-layout-cell u-palette-4-base u-size-15 u-layout-cell-3">
                <div class="u-container-layout u-container-layout-3">
                  <span class="u-icon u-icon-circle u-spacing-20 u-text-palette-4-base u-white u-icon-3">
                    <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 481.831 481.831" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-d1b7"></use></svg>
                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 481.831 481.831" x="0px" y="0px" id="svg-d1b7" style="enable-background:new 0 0 481.831 481.831;"><g><g><g><path d="M479.489,422.924l0.024-0.024L352.929,296.34c57.641-88.935,32.272-207.759-56.664-265.4     C207.33-26.702,88.506-1.333,30.865,87.603C10.726,118.676,0.007,154.912,0.001,191.94     c-0.262,105.848,85.333,191.868,191.181,192.13c37.379,0.092,73.97-10.748,105.267-31.186l126.528,126.552     c3.124,3.123,8.188,3.123,11.312,0l45.2-45.2C482.612,431.112,482.612,426.048,479.489,422.924z M292.929,336.116     c-69.908,49.153-165.057,40.809-225.344-19.76C-1.153,247.629-1.161,136.192,67.566,67.454s180.164-68.745,248.902-0.018     c60.405,60.396,68.722,155.446,19.725,225.416C324.387,309.671,309.748,324.31,292.929,336.116z M428.657,462.468     L309.753,343.564c1.288-1,2.504-2.088,3.768-3.12c1.08-0.888,2.16-1.768,3.2-2.68c3.792-3.248,7.504-6.584,11.008-10.088     c3.504-3.504,6.84-7.2,10.088-11.008c0.912-1.064,1.792-2.144,2.68-3.2c1.032-1.264,2.12-2.48,3.12-3.768l118.928,118.88     L428.657,462.468z"></path><path d="M282.563,112.81c-4.278-1.105-8.641,1.468-9.746,5.746l-33.136,132.552L200.209,126.1     c-0.784-2.495-2.738-4.449-5.234-5.234c-4.215-1.325-8.706,1.018-10.03,5.234l-39.472,125l-33.136-132.544     c-0.009-0.037-0.018-0.074-0.028-0.11c-1.104-4.278-5.467-6.851-9.745-5.747c-4.278,1.104-6.851,5.467-5.747,9.745l40,160     c0.869,3.474,3.94,5.948,7.52,6.056c3.605,0.184,6.864-2.134,7.872-5.6l40.368-127.832L232.945,282.9     c1.048,3.333,4.138,5.6,7.632,5.6h0.24c3.58-0.108,6.651-2.582,7.52-6.056l40-160     C289.369,118.194,286.797,113.903,282.563,112.81z"></path>
</g>
</g>
</g></svg>
                  </span>
                  <h2 class="u-align-center u-custom-font u-font-roboto-condensed u-text u-text-4">키워드로 검색</h2>
                  <p class="u-align-center u-text u-text-5">약의 색깔, 모양,&nbsp;<br>표기 내용을<br>직접 입력하여 검색<br>
                  </p>
                  <a href="https://nicepage.com" class="u-btn u-button-style u-text-palette-4-base u-white u-btn-3">카테고리</a>
                </div>
              </div>
              <div class="u-container-style u-layout-cell u-palette-3-base u-right-cell u-size-15 u-layout-cell-4">
                <div class="u-container-layout u-container-layout-4">
                  <span class="u-icon u-icon-circle u-spacing-20 u-text-palette-3-base u-white u-icon-4">
                    <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-6078"></use></svg>
                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 512 512" id="svg-6078"><g><path d="m155.13 326.845c1.465 1.464 3.385 2.197 5.304 2.197s3.839-.732 5.304-2.197l47.852-47.852c2.145-2.145 2.786-5.371 1.625-8.173-1.16-2.803-3.896-4.63-6.929-4.63h-24.004l29.308-29.308c2.929-2.929 2.929-7.678 0-10.606-2.93-2.929-7.678-2.929-10.607 0l-42.11 42.111c-2.145 2.145-2.786 5.371-1.625 8.173 1.16 2.803 3.896 4.63 6.929 4.63h24.004l-35.049 35.049c-2.931 2.929-2.931 7.678-.002 10.606z"></path><path d="m5.789 415.067c0 47.985 39.038 87.024 87.023 87.024h162.564c11.236 4.656 23.627 7.724 36.86 9.087 5.119.545 10.433.822 15.795.822 26.753 0 52.493-7.108 70.622-19.503 3.42-2.338 4.297-7.005 1.959-10.424-2.338-3.42-7.006-4.296-10.424-1.959-15.696 10.731-38.351 16.886-62.157 16.886-4.833 0-9.612-.248-14.232-.74-12.126-1.249-23.85-4.198-33.914-8.526-.085-.037-.17-.072-.256-.107-20.91-9.072-33.388-23.29-33.388-38.057v-74.87c0-1.153.938-2.09 2.09-2.09h5.751c.008 0 .016.001.024.001.007 0 .014-.001.021-.001h243.794c7.328 0 13.29 5.962 13.29 13.29 0 7.334-5.966 13.3-13.3 13.3h-71.87c-8.949 0-16.229 7.281-16.229 16.229v34.141c0 3.027-.517 6.059-1.534 9.012-1.35 3.916.73 8.185 4.647 9.535 3.913 1.35 8.185-.731 9.534-4.647 1.561-4.53 2.353-9.206 2.353-13.9v-34.14c0-.678.552-1.229 1.229-1.229h71.87c15.604 0 28.3-12.695 28.3-28.3 0-15.599-12.69-28.29-28.29-28.29h-87.461l-17.461-30.242v-188.28c0-37.016-23.233-68.703-55.881-81.258 2.374-3.807 3.715-8.286 3.715-13.026v-20.23c0-13.551-11.024-24.575-24.574-24.575h-213.731c-13.55 0-24.574 11.024-24.574 24.574v20.23c0 4.74 1.341 9.219 3.715 13.026-32.647 12.555-55.88 44.242-55.88 81.258v178.494c0 4.142 3.357 7.5 7.5 7.5s7.5-3.358 7.5-7.5v-137.33h337.21v121.26c-10.928-17.212-29.415-27.412-49.968-27.412-5.825 0-11.595.843-17.14 2.501-14.417 4.29-26.56 13.928-34.194 27.136-.071.123-.139.248-.202.374l-26.998 53.499h-1.166c-9.155 0-16.629 7.241-17.05 16.293h-190.492v-23.57c0-4.142-3.357-7.5-7.5-7.5s-7.5 3.358-7.5 7.5zm224.612 72.024h-137.589c-39.714 0-72.023-32.31-72.023-72.024v-26.164h190.452v60.667c0 13.785 6.877 26.888 19.16 37.521zm-209.612-321.839v-26.164c0-39.714 32.31-72.024 72.023-72.024h125.022c4.143 0 7.5-3.358 7.5-7.5s-3.357-7.5-7.5-7.5h-125.022c-5.006 0-9.912.431-14.689 1.246-3.146-1.621-5.17-4.865-5.17-8.506v-20.23c0-5.279 4.295-9.574 9.574-9.574h213.73c5.279 0 9.574 4.295 9.574 9.574v20.23c0 3.641-2.024 6.885-5.17 8.506-4.777-.816-9.683-1.246-14.689-1.246h-35.52c-4.143 0-7.5 3.358-7.5 7.5s3.357 7.5 7.5 7.5h35.52c39.715 0 72.024 32.309 72.024 72.024v26.164zm248.998 145.814c5.791-9.923 14.565-16.868 25.394-20.09 4.159-1.245 8.483-1.875 12.851-1.875 16.004 0 30.334 8.276 38.335 22.141l26.773 46.369h-126.842z"></path>
</g></svg>
                  </span>
                  <h2 class="u-align-center u-custom-font u-font-roboto-condensed u-text u-text-body-alt-color u-text-6">영양 성분 찾기&nbsp;</h2>
                  <p class="u-align-center u-text u-text-body-alt-color u-text-7">찾고 싶은&nbsp;<br>영양 성분 검색
                  </p>
                  <a href="ss_nr.html" class="u-btn u-button-style u-text-palette-3-base u-white u-btn-4">검색</a>
                </div>
              </div>
              <div class="u-container-style u-layout-cell u-palette-2-base u-right-cell u-size-15 u-layout-cell-5">
                <div class="u-container-layout u-valign-top u-container-layout-5">
                  <span class="u-border-2 u-border-white u-icon u-icon-circle u-spacing-10 u-text-palette-2-base u-white u-icon-5">
                    <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 368.16 368.16" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-84df"></use></svg>
                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 368.16 368.16" x="0px" y="0px" id="svg-84df" style="enable-background:new 0 0 368.16 368.16;"><g><g><g><path d="M184.08,0c-74.992,0-136,61.008-136,136c0,24.688,11.072,51.24,11.536,52.36c3.576,8.488,10.632,21.672,15.72,29.4     l93.248,141.288c3.816,5.792,9.464,9.112,15.496,9.112s11.68-3.32,15.496-9.104l93.256-141.296     c5.096-7.728,12.144-20.912,15.72-29.4c0.464-1.112,11.528-27.664,11.528-52.36C320.08,61.008,259.072,0,184.08,0z      M293.8,182.152c-3.192,7.608-9.76,19.872-14.328,26.8l-93.256,141.296c-1.84,2.792-2.424,2.792-4.264,0L88.696,208.952     c-4.568-6.928-11.136-19.2-14.328-26.808C74.232,181.816,64.08,157.376,64.08,136c0-66.168,53.832-120,120-120     c66.168,0,120,53.832,120,120C304.08,157.408,293.904,181.912,293.8,182.152z"></path><path d="M184.08,64.008c-39.704,0-72,32.304-72,72c0,39.696,32.296,72,72,72c39.704,0,72-32.304,72-72     C256.08,96.312,223.784,64.008,184.08,64.008z M184.08,192.008c-30.872,0-56-25.12-56-56s25.128-56,56-56s56,25.12,56,56     S214.952,192.008,184.08,192.008z"></path>
</g>
</g>
</g></svg>
                  </span>
                  <h2 class="u-align-center u-custom-font u-font-roboto-condensed u-text u-text-body-alt-color u-text-8">약국 및 병원 찾기</h2>
                  <p class="u-align-center u-text u-text-body-alt-color u-text-9">현재 위치를 기준으로<br>약국 및 병원 검색
                  </p>
                  <a href="<c:url value='/map/pharmacy'/>" class="u-btn u-button-style u-text-palette-2-base u-white u-btn-5">약국</a>
                  <a href="<c:url value='/map/hospital'/>" class="u-btn u-button-style u-text-palette-2-base u-white u-btn-6">병원</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <p class="u-text u-text-10">Image from <a href="https://www.freepik.com/free-photos-vectors/hand" target="_blank">Freepik</a>
        </p>
      </div>
    </section>
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-16e6"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">SANGBUSAMJO</p>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/html-templates" target="_blank">
        <span>HTML Template</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="https://nicepage.com/html" target="_blank">
        <span>Nicepage</span>
      </a>. 
    </section>
  </body>
</html>