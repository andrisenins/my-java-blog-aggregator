$(document).ready(
    function() {
      $(".registrationForm").validate(
          {
            rules : {
              name : {
                required : true,
                minlength : 3
              },
              email : {
                required : true,
                email : true
              },
              password : {
                required : true,
                minlength : 6
              },
              password_again : {
                required : true,
                minlength : 6,
                equalTo : "#password"
              }
            },
              highlihgt : function(element) {
              $(element).closest('.form-group').removeClass('has-success')
                  .addClass('has-error');
            },
            unhighlihgt : function(element) {
              $(element).closest('.form-group').removeClass('has-error')
                  .addClass('has-success');
            }
          });
    });