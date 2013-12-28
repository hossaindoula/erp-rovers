<#import "../template/admin_layout.ftl" as layout>
<@layout.admin_layout "${PageTitle}" >


<div class="rightpanel">

<ul class="breadcrumbs">
    <li><a href="dashboard.html"><i class="iconfa-home"></i></a> <span class="separator"></span></li>
    <li>${PageTitle}</li>
    <li class="right">
        <a href="" data-toggle="dropdown" class="dropdown-toggle"><i class="icon-tint"></i> Color Skins</a>
        <ul class="dropdown-menu pull-right skin-color">
            <li><a href="default">Default</a></li>
            <li><a href="navyblue">Navy Blue</a></li>
            <li><a href="palegreen">Pale Green</a></li>
            <li><a href="red">Red</a></li>
            <li><a href="green">Green</a></li>
            <li><a href="brown">Brown</a></li>
        </ul>
    </li>
</ul>

<div class="pageheader">
    <form action="results.html" method="post" class="searchbar">
        <input type="text" name="keyword" placeholder="To search type and hit enter..." />
    </form>
    <div class="pageicon"><span class="iconfa-laptop"></span></div>
    <div class="pagetitle">
        <h5>All Features Summary</h5>
        <h1>${PageTitle}</h1>
    </div>
</div><!--pageheader-->

<div class="maincontent">
<div class="maincontentinner">




<div class="widgetbox box-inverse">
    <h4 class="widgettitle">New Category Entry</h4>
    <div class="widgetcontent wc1">
        <form id="form1" class="stdform" method="POST" action="saveCategory">
            <div class="par control-group">
                <label class="control-label" for="firstname">Category Name</label>
                <div class="controls"><input type="text" name="categoryName" id="categoryName" class="input-large" /></div>
            </div>

            <!-- <div class="control-group">
                <label class="control-label" for="lastname">Last Name</label>
                <div class="controls"><input type="text" name="lastname" id="lastname" class="input-large" /></div>
            </div> -->

            <p class="stdformbutton">
                <button class="btn btn-primary">Submit Button</button>
            </p>
        </form>
    </div><!--widgetcontent-->
</div><!--widget-->




<div class="footer">
    <div class="footer-left">
        <span>&copy; ${companyCopyRightText}</span>
    </div>
    <div class="footer-right">
        <span>${company}</span>
    </div>
</div><!--footer-->

</div><!--maincontentinner-->
</div><!--maincontent-->

</div><!--rightpanel-->

</@layout.admin_layout>