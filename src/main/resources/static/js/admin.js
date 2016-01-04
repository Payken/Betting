/**
 * Created by fdarmoch on 2016-01-02.
 */

angular.module("AIpro").controller("adminCtrl", function($scope, $http){

    $scope.submitForm = function () {
        $scope.object = {
            name: $scope.name,
            manufacturer: $scope.manufacturer,
        }

    console.log($scope.object.name);
        console.log($scope.object.manufacturer);
    $http.post("/index/addProduct", $scope.object)
        .then(function(response)
        {
           console.log(response.data);
        });
    }
    ///////////////////////////////////////////
    $scope.addManufacturer = function () {
        $scope.object = {
           name: $scope.nname,
            kaszanka: $scope.jelito
        }

        console.log($scope.object.name);

        $http.post("/index/addManufacturer", $scope.object)
            .then(function(response)
            {
                console.log(response.data);
            });
    }



});