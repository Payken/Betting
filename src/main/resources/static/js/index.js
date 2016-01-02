/**
 * Created by fdarmoch on 2016-01-02.
 */

angular.module("AIpro").controller("indexCtrl", function($scope, $http){

    $scope.submitForm = function () {
        $scope.object = {
            name: $scope.name

        }
    console.log($scope.object.name);
    $http.post("/index/addProduct", $scope.object)
        .then(function(response)
        {
           console.log(response.data);
        });
    }


});