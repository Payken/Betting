/**
 * Created by fdarmoch on 2016-01-02.
 */

angular.module("AIpro").controller("adminCtrl", function($scope, $http){

    //
    //$scope.product = {
    //    name: 'dupa'
    //};
    //
    //$scope.upload = function (file) {
    //    console.log("aaaa");
    //    $scope.product.image = file;
    //    Upload.upload({
    //        url: '/admin/addProduct',
    //        data: $scope.product
    //    }).then(function (resp) {
    //        console.log('Success ' + resp.config.data.file.name + 'uploaded. Response: ' + resp.data);
    //    });
    //};
//
    $scope.submitForm = function () {
        $scope.object = {
            name: $scope.name,
            manufacturer: $scope.manufacturer,
            file: $scope.file,
            price: $scope.price,

        }

//
//  //         var file = $scope.myFile;
//  //         var uploadUrl = 'admin/uploadPhoto';
//  //    console.log(JSON.toString($scope.myFile));
//  //    console.log(JSON.stringify($scope.myFile));
// //            uploadFileToUrl(file, uploadUrl);
////console.log("wyslalem");
        console.log($scope.object.name);
        console.log($scope.object.manufacturer);
        console.log($scope.object.file);
        console.log($scope.object.file2);
        $http.post("admin/addProduct", $scope.object)
            .then(function (response) {
                console.log(response.data);
            });

        //$http.post("admin/uploadPhoto", $scope.myFile).then(function (response) {
        //    console.log(response.data);
        //});
    }
        ///////////////////////////////////////////
    $scope.addManufacturer = function () {
        $scope.object = {
           name: $scope.nname,

        }

        console.log($scope.object.name);

        $http.post("admin/addManufacturer", $scope.object)
            .then(function(response)
            {
                console.log(response.data);
            });
    }
//    /////////////////////////////////////////////////
//
//    $scope.addPhoto = function () {
//        $scope.object = {
//            file: $scope.file,
//
//        formData : file.value
//
//        }
//
//        console.log($scope.object.file);
//
//        $http.post("/index/addPhoto", $scope.object)
//            .then(function(response)
//            {
//                console.log(response.data);
//            });
//    }
//
//
//
//    $scope.product = {
//        name: 'dupa'
//    };
//
//    $scope.upload = function (file) {
//        console.log("aaaa");
//        $scope.product.image = file;
//        Upload.upload({
//            url: '/index/dupa/uploadProduct',
//            data: $scope.product
//        }).then(function (resp) {
//            console.log('Success ' + resp.config.data.file.name + 'uploaded. Response: ' + resp.data);
//        }, function (resp) {
//            console.log('Error status: ' + resp.status);
//        });
//    };

});
