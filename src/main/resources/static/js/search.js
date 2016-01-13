/**

 * Created by fdarmoch on 2016-01-02.
 */

angular.module("AIpro").controller("adminCtrl", function($scope, $http, $attrs){


    $scope.searchProduct = function () {
        $scope.object = {

            productname: $scope.productname,
            pricemin: $scope.pricemin,
            pricemax: $scope.pricemax,
            manufacturerid: $scope.manufacturerid

        }


        $http.post("search/searchProduct", $scope.object)
            .then(function (response) {
                console.log(response.data);



                //a.forEach(function(entry) {
                //    console.log(entry);
                //});
                response.data.forEach(function(entry){console.log(entry.id);})
                $scope.response=response.data;
                console.log($scope.response);
                /*
                 var jsonObj = JSON.parse(response.data);
                 console.log(jsonObj);*/
                //for (var i=0;i<response.data.length ;i++)
                //    console.log(response.i);
            });

    }


    $scope.addCart = function (id) {
        $scope.object = {

        product: id,

        }


        $http.post("search/addCart", $scope.object)
            .then(function (response) {
                console.log(response.data);



                //a.forEach(function(entry) {
                //    console.log(entry);
                //});
                response.data.forEach(function(entry){console.log(entry.id);})
                $scope.response=response.data;
                console.log($scope.response);
                /*
                 var jsonObj = JSON.parse(response.data);
                 console.log(jsonObj);*/
                //for (var i=0;i<response.data.length ;i++)
                //    console.log(response.i);
            });

    }

});
